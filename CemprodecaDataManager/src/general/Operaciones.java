package general;
import java.util.ArrayList;
import java.util.Date;

public class Operaciones {
	String numeroDeOperacion;
	Date fechaDeFormalizacion;
	Date fechaDeCancelacion;
	double montoDelPrestmo;
	double taza;
	double pagoMensual;
	boolean activo;/*si la operacion esta al cobro o no*/
	
	ArrayList<TablaDePagos> tablaDePagos;
	
	ArrayList<Recibos> recibos;
	
	public Operaciones(Date fechaDeFormalizacion, Date fechaDeCancelacion,
			double montoDelPrestmo, double taza, double pagoMensual,
			boolean activo) {
		
		this.fechaDeFormalizacion = fechaDeFormalizacion;
		this.fechaDeCancelacion = fechaDeCancelacion;
		this.montoDelPrestmo = montoDelPrestmo;
		this.taza = taza;
		this.pagoMensual = pagoMensual;
		this.activo = activo;
		
	}/*fin de constructor*/
	
	/*operaciones con la tabla de pagos*/
	
	
	
	
	
}/*fin de clase*/
