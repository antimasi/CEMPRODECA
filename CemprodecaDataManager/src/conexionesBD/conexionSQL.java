package conexionesBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import estructuraDeDatos.Recibos;
import estructuraDeDatos.TablaDePagos;

public class conexionSQL {
	String BaseDeDatos = "";
	String User = "";
	String Password = "";
	String URL = "";
	
	Connection con = null;
	
	public void conectar(){
		try{
			Class.forName("com.mysql.jdbc.Driver"); 
			con = DriverManager.getConnection(URL,User,Password);
			
		 }catch(SQLException e){
	         System.out.println(e);
	      }catch(ClassNotFoundException e){
	         System.out.println(e);
	      }
	}
	
	
	public void CargarRecibosAlaDB(){
		//
	}/*fin de carga de recibos*/
}
