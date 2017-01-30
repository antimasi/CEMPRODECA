package estructuraDeDatos;


import java.util.Calendar;
import javax.swing.JOptionPane;

public class Recibos {
	
	
	String numeroDeOperacion;/*indexador para la base de datos*/
	
	Calendar fechaActual = Calendar.getInstance();
	Calendar fechaDePago;
	double saldo = 0;
	double totalaPagar = 0;
	double intereses = 0;
	double amortizacion = 0;
	double poliza = 0;
	double morosidad = 0;
	double interesesPendientes = 0;
	double amortizacionPendiente = 0;
	double pago = 0;
	double vuelto = 0;/*interno para saber si hay vuelto o no*/
	
	int cuota;/*numero de cuota se toma de el recibo anterior*/
	
	public void Relleno(Calendar fechaActual, Calendar fechaDePago, double saldo,
			double totalaPagar, double intereses, double amortizacion, double poliza,
			double interesesPendientes, double amortizacionPendiente){
		
		this.fechaActual = fechaActual;
		this.fechaDePago = fechaDePago;
		this.saldo = saldo;
		this.totalaPagar = totalaPagar;
		this.intereses = intereses;
		this.amortizacion = amortizacion;
		this.poliza = poliza;
		this.interesesPendientes = interesesPendientes;
		this.amortizacionPendiente = amortizacionPendiente;
		
	}/*fin del relleno*/
	
}/*fin de clase*/
