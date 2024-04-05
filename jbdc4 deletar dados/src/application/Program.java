package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DB.getConnection();
			
			//deletar dados
	
			ps = conn.prepareStatement("delete from department WHERE Name = ? AND Id = ?", Statement.RETURN_GENERATED_KEYS);
			

			ps.setString(1, "AstonMartin");
			ps.setInt(2, 8);

			int teste = ps.executeUpdate();
			System.out.println(teste);

			if(teste == 0) {
			    System.out.println("Sem alterações na tabela");
			} 
			else {
			    ResultSet rs = ps.getGeneratedKeys();
			    
			    while(rs.next()) {
			        int id = rs.getInt(1);
			        System.out.println("ID alterado: " + id);
			    }
			}

			System.out.println(teste);

		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(ps);
			DB.closeConnection();
		}
	}

}
