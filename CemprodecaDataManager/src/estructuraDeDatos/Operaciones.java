package estructuraDeDatos;
import java.util.ArrayList;
import java.util.Date;

public class Operaciones {
	
	String Cedula;
	String numeroDeOperacion;
	Date fechaDeFormalizacion;
	Date fechaDeCancelacion;
	double montoDelPrestmo;
	double taza;
	double pagoMensual;
	boolean activo;/*si la operacion esta al cobro o no*/
	
	ArrayList<TablaDePagos> tablaDePagos;
	
	ArrayList<Recibos> recibos;
	
	public void setOperaciones(Date fechaDeFormalizacion, Date fechaDeCancelacion,
			double montoDelPrestmo, double taza, double pagoMensual,
			boolean activo) {
		
		this.fechaDeFormalizacion = fechaDeFormalizacion;
		this.fechaDeCancelacion = fechaDeCancelacion;
		this.montoDelPrestmo = montoDelPrestmo;
		this.taza = taza;
		this.pagoMensual = pagoMensual;
		this.activo = activo;
		
	}/*fin de constructor*/
	
	
	public void setTablaDePagos(ArrayList<TablaDePagos> t){
		this.tablaDePagos = t;
	}/*fin llenado tabla de pagos*/
	
	
	public void setRecibos(ArrayList<Recibos> r){
		this.recibos = r;
	}/*fin de llenado de recibos*/


	public String getCedula() {
		return Cedula;
	}


	public void setCedula(String cedula) {
		Cedula = cedula;
	}


	public String getNumeroDeOperacion() {
		return numeroDeOperacion;
	}


	public void setNumeroDeOperacion(String numeroDeOperacion) {
		this.numeroDeOperacion = numeroDeOperacion;
	}


	public Date getFechaDeFormalizacion() {
		return fechaDeFormalizacion;
	}


	public void setFechaDeFormalizacion(Date fechaDeFormalizacion) {
		this.fechaDeFormalizacion = fechaDeFormalizacion;
	}


	public Date getFechaDeCancelacion() {
		return fechaDeCancelacion;
	}


	public void setFechaDeCancelacion(Date fechaDeCancelacion) {
		this.fechaDeCancelacion = fechaDeCancelacion;
	}


	public double getMontoDelPrestmo() {
		return montoDelPrestmo;
	}


	public void setMontoDelPrestmo(double montoDelPrestmo) {
		this.montoDelPrestmo = montoDelPrestmo;
	}


	public double getTaza() {
		return taza;
	}


	public void setTaza(double taza) {
		this.taza = taza;
	}


	public double getPagoMensual() {
		return pagoMensual;
	}


	public void setPagoMensual(double pagoMensual) {
		this.pagoMensual = pagoMensual;
	}


	public boolean isActivo() {
		return activo;
	}


	public void setActivo(boolean activo) {
		this.activo = activo;
	}


	public ArrayList<TablaDePagos> getTablaDePagos() {
		return tablaDePagos;
	}


	public ArrayList<Recibos> getRecibos() {
		return recibos;
	}
	
	
}/*fin de clase*/
