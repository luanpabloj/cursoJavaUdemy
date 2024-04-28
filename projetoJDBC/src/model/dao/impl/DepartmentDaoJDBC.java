package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;

import db.DB;
import db.DbException;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentDaoJDBC implements DepartmentDao{
	
	private Connection conn;
	

	public DepartmentDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Department department) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = conn.prepareStatement("INSERT INTO department"
					+ "(Name) "
					+ "VALUES "
					+ "(?) ", Statement.RETURN_GENERATED_KEYS);
					
			ps.setString(1, department.getDepartmentName());
			
			int rows = ps.executeUpdate();
			
			if(rows > 0) {
				rs = ps.getGeneratedKeys();
				if(rs.next()) {
					int id = rs.getInt(1);
					ps.setInt(1, id);
				}
			}
			
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		
	}

	@Override
	public void update(Department department) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = conn.prepareStatement("UPDATE department SET Name = ? WHERE Id = ?");
			
			ps.setString(1, department.getDepartmentName());
			ps.setInt(2, department.getDepartmentId());
			
			ps.executeUpdate();
			
			
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(ps);
			DB.closeResultSet(rs);
		}
		
	}

	@Override
	public void deleteById(Integer id) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = conn.prepareStatement("DELETE FROM department WHERE Id = ?");
			ps.setInt(1, id);
			
			ps.executeUpdate();
			
		}catch(SQLException e){
			throw new DbException(e.getMessage());
		}finally {
			DB.closeResultSet(rs);
			DB.closeStatement(ps);
		}
		
	}

	@Override
	public Department findById(Integer id) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = conn.prepareStatement("SELECT * FROM department WHERE Id = ?");
			
			ps.setInt(1, id);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				Department department = newDepartment(rs);
				return department;
			}
			return null;
			
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(ps);
			DB.closeResultSet(rs);
		}
	}
	
	private Department newDepartment(ResultSet rs) throws SQLException {
		Department department = new Department();
		department.setDepartmentId(rs.getInt("Id"));
		department.setDepartmentName(rs.getString("Name"));
		return department;
	}

	@Override
	public List<Department> findAll() {
		PreparedStatement pt = null;
		ResultSet rs = null;
		try {
			pt = conn.prepareStatement("SELECT * FROM department ORDER BY Name");
			
			rs = pt.executeQuery();
			List<Department> list = new ArrayList<Department>();
			
			while(rs.next()) {
				Department department = new Department();
				department.setDepartmentId(rs.getInt("Id"));
				department.setDepartmentName(rs.getString("Name"));
				
				list.add(department);
			}
			
			return list;
					
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}finally {
			DB.closeStatement(pt);
			DB.closeResultSet(rs);
		}
	}


}
