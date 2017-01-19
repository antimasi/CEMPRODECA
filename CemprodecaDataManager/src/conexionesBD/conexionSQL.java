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
	
	public ArrayList<TablaDePagos> DescargaTablaDePagos(){
	System.out.println("NO ESTA DEFINIDO EL CONTENIDO DEL METODO");
	return null;/*retorna un arraylist sacado de la db con las filas de la tabla de pagos*/
	}/*fin de TablaDePagos entrante*/

	public ArrayList<Recibos> DescargaRecibos(){
		System.out.println("NO ESTA DEFINIDO EL CONTENIDO DEL METODO");
	return null;/*retorna los recibos viejos de la db*/
	}/*fin de Recibos entrantes*/
	
	public void CargarTablaDePagosAlaDB(){
		
	}/*fin de carga de tabla de pagos*/
	
	public void CargarRecibosAlaDB(){
		//
	}/*fin de carga de recibos*/
}
