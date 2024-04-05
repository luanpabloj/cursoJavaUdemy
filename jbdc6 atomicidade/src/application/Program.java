package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement st = null;
		
		
		//atomicidade
		
		try {
			conn = DB.getConnection();
			
			st = conn.createStatement();
			
			conn.setAutoCommit(false);
			
			int rows = st.executeUpdate("UPDATE department SET Name = 'AstonMartin' WHERE Id = 8");
			
			int i = 0;
			
			if(i == 0) {
				throw new DbException("Transação não concluida");
			}
			
			int rows2 = st.executeUpdate("UPDATE department SET Name = 'Fiat' WHERE Id = 9");
			
			conn.commit();
			
		}
		catch(SQLException e) {
			try {
				conn.rollback();
				
				throw new DbException("Ocorreu um rollback: " + e.getMessage());
			} catch (SQLException e1) {
				e1.printStackTrace();
				throw new DbException("Ocorreu um erro no rollback: " + e.getMessage());
			}
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
