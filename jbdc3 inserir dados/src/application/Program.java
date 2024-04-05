package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {
		//Inserir dados
	
		
		Connection conn = null;
		PreparedStatement pt = null;
		
		try {
			conn = DB.getConnection();
			pt = conn.prepareStatement("insert into department (Name) values ('Motors')", 
					Statement.RETURN_GENERATED_KEYS);
			
			int teste = pt.executeUpdate();
			
			if(teste == 0) {
				System.out.println("Não há inserção de dados na tabela");
			}
			else {
				ResultSet rs = pt.getGeneratedKeys();
				
				while(rs.next()) {
					int id = rs.getInt(1);
					System.out.println("ID do produto adicionado: " + id);
				}
			}
			
			System.out.println(teste);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally{
			DB.closeStatement(pt);
			DB.closeConnection();
		}
	}

}
