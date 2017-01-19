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
	
	public void pagoSinMorosidad(double pago){
		
	}/*fin de pagoCompleto, se paga sin que exista morosidad*/
	
	public void pagoDeIntereses(double pago){
		
	}/*pago de interes e intereses atrasados*/
	
	public void pagoDeAmortizacionesPendientes(double pago){
		this.pago = pago;
		vuelto = pago;
		if(vuelto >= amortizacionPendiente){
			vuelto = amortizacionPendiente - vuelto;
			JOptionPane.showMessageDialog(null, "Su pago fue de: "+pago+"\nSu vuelto es de: "+vuelto);
		}else{/*falta para terminar de pagar*/
			
			amortizacionPendiente = vuelto - amortizacionPendiente;
			JOptionPane.showMessageDialog(null, "Su pago fue de: "+pago+"\nSu saldo pendiente es de: "+amortizacionPendiente);
			
		}/*fin de pago*/
	}/*pago de amortizacion, primero atrasada y luego se resta al saldo*/
	
	public void pagoAlSaldo(double pago){/*se reduce el saldo directamente, requiere recalcular la tabla de pagos*/
		this.pago = pago;
		vuelto = pago;
		if(vuelto >= saldo){
			vuelto -= saldo;
			if(vuelto >= 0){
				saldo = 0;
			}else{
				saldo = saldo - vuelto;
			}
			JOptionPane.showMessageDialog(null, "Su cambio es de: "+vuelto+"\nSu saldo queda en "+saldo);
		}else{
			
			JOptionPane.showMessageDialog(null, "");
		}
	}
	
}/*fin de clase*/
