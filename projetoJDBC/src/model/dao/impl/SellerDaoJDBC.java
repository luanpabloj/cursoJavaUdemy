package model.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import db.DB;
import db.DbException;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class SellerDaoJDBC implements SellerDao{
	
	private Connection conn;
	
	
	public SellerDaoJDBC(Connection conn) {
		this.conn = conn;
	}
	

	@Override
	public void insert(Seller seller) {
		PreparedStatement pt = null;
		ResultSet rs = null;
		try {
			pt = conn.prepareStatement("INSERT INTO seller "
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
					+ "VALUES "
					+ "(?, ?, ?, ?, ?) ", Statement.RETURN_GENERATED_KEYS);
			
			pt.setString(1, seller.getName());
			pt.setString(2, seller.getEmail());
			pt.setDate(3, new java.sql.Date(seller.getBirthDate().getTime()));
			pt.setDouble(4, seller.getBaseSalary());
			pt.setInt(5, seller.getDepartment().getDepartmentId());

			int rows = pt.executeUpdate();
			
			if(rows > 0) {
				rs = pt.getGeneratedKeys();
				if(rs.next()) {
					int id = rs.getInt(1);
					seller.setId(id);
				}
			}
			
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally{
			DB.closeStatement(pt);
			DB.closeResultSet(rs);
		}
		
	}

	@Override
	public void update(Seller seller) {
		PreparedStatement pt = null;
		ResultSet rs = null;
		try {
			pt = conn.prepareStatement("UPDATE seller "
					+ "SET Name = ?, Email = ?, BirthDate = ?, BaseSalary = ?, DepartmentId = ? "
					+ "WHERE Id = ?");
			
			pt.setString(1, seller.getName());
			pt.setString(2, seller.getEmail());
			pt.setDate(3, new java.sql.Date(seller.getBirthDate().getTime()));
			pt.setDouble(4, seller.getBaseSalary());
			pt.setInt(5, seller.getDepartment().getDepartmentId());
			pt.setInt(6, seller.getId());
			
			pt.executeUpdate();
			

		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally{
			DB.closeStatement(pt);
			DB.closeResultSet(rs);
		}
		
	}

	@Override
	public void deleteById(Integer id) {
		PreparedStatement pt = null;
		ResultSet rs = null;
		try {
			pt = conn.prepareStatement("DELETE FROM seller "
					+ "WHERE Id = ?");
			
			pt.setInt(1, id);
			
			pt.executeUpdate();
			

		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally{
			DB.closeStatement(pt);
			DB.closeResultSet(rs);
		}
		
	}

	@Override
	public Seller findById(Integer id) {
		PreparedStatement pt = null;
		ResultSet rs = null;
		try {
			pt = conn.prepareStatement("SELECT seller.*,department.Name as DepName " + 
					"FROM seller INNER JOIN department " +
					"ON seller.DepartmentId = department.Id " +
					"WHERE seller.Id = ? ");
			pt.setInt(1, id);
			rs = pt.executeQuery();
			if(rs.next()) {
				Department dep = newDepartment(rs);
				Seller seller = newSeller(rs, dep);
				
				return seller;
			}
			return null;
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally{
			DB.closeStatement(pt);
			DB.closeResultSet(rs);
		}
	}

	private Seller newSeller(ResultSet rs, Department dep) throws SQLException {
		Seller seller = new Seller();
		seller.setId(rs.getInt("Id"));
		seller.setName(rs.getString("Name"));
		seller.setEmail(rs.getString("Email"));
		seller.setBirthDate(rs.getDate("BirthDate"));
		seller.setBaseSalary(rs.getDouble("BaseSalary"));
		seller.setDepartment(dep);
		return seller;
	}


	private Department newDepartment(ResultSet rs) throws SQLException {
		Department dep = new Department();
		dep.setDepartmentId(rs.getInt("DepartmentId"));
		dep.setDepartmentName(rs.getString("DepName"));
		return dep;
	}


	@Override
	public List<Seller> findAll() {
		PreparedStatement pt = null;
		ResultSet rs = null;
		try {
			pt = conn.prepareStatement("SELECT seller.*,department.Name as DepName "
					+ "FROM seller INNER JOIN department "
					+ "ON seller.DepartmentId = department.Id "
					+ "ORDER BY Name ");

			rs = pt.executeQuery();
			
			List<Seller> list = new ArrayList<Seller>();
						
			while(rs.next()) {
				Department dep = newDepartment(rs);

				Seller seller = newSeller(rs, dep);
				list.add(seller);
			}
			
			return list;
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally{
			DB.closeStatement(pt);
			DB.closeResultSet(rs);
		}
	}


	@Override
	public List<Seller> findByDepartment(Department department) {
		PreparedStatement pt = null;
		ResultSet rs = null;
		try {
			pt = conn.prepareStatement("SELECT seller.*,department.Name as DepName "
					+ "FROM seller INNER JOIN department "
					+ "ON seller.DepartmentId = department.Id "
					+ "WHERE DepartmentId = ? "
					+ "ORDER BY Name ");

			pt.setInt(1, department.getDepartmentId());
			rs = pt.executeQuery();
			
			List<Seller> list = new ArrayList<Seller>();
			
			
			while(rs.next()) {
				Department dep = newDepartment(rs);
				Seller seller = newSeller(rs, dep);
				list.add(seller);
			}
			
			return list;
		}catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally{
			DB.closeStatement(pt);
			DB.closeResultSet(rs);
		}
	}
	

}
