import java.sql.SQLException;
import java.sql.*;

import com.sun.corba.se.pept.transport.Connection;



public class MyDataAcces {

	private String _usuario="root";
	private String _pwd="1234";
	private static String bd="logistics";
	static String _url = "jdbc:mysql://localhost/"+bd;
	java.sql.Connection conn = null;
	
	
    public MyDataAcces() throws InstantiationException, IllegalAccessException{
	try{
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(_url,_usuario,_pwd);
		if(conn!=null){
			System.out.println("Conexion a base de datos"+_url+"... ok");
		}
	}catch(SQLException ex){
		System.out.println("Hubo un problema al intenter conectarse a la BD");
	}catch(ClassNotFoundException exx){
		System.out.println(exx);
	}
    }
	public ResultSet GetQuery(String _query){
		Statement state =null;
		ResultSet resultado = null;
		try{
		state=(Statement)conn.createStatement();
		resultado = state.executeQuery(_query);
		}catch(SQLException e){
			
		}
		return resultado;
		
	}
	public void setQuery(String _query){
		Statement state = null;
		try{
			state=(Statement)conn.createStatement();
			 state.executeQuery(_query);
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	

}