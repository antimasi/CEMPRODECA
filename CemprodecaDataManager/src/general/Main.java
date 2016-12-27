package general;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Main implements ActionListener {
	
	JFrame VentanaMain = new JFrame("CEMPRODECA");
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {	
					Main frame = new Main();
					frame.CreaVentana();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}/*fin de main*/
	
	public void CreaVentana(){
		
		VentanaMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		VentanaMain.setBounds(100, 100, 800, 400);
		VentanaMain.setVisible(true);
		
		JMenuBar jmbPrincipal = new JMenuBar();
		jmbPrincipal.setBounds(0,0,800,10);
		VentanaMain.setJMenuBar(jmbPrincipal);
		jmbPrincipal.repaint();
		
		JMenu jmNuevo = new JMenu("Nuevo");
		jmbPrincipal.add(jmNuevo);
		
		JMenuItem jmiAgregarUnCliente = new JMenuItem("Agregar un Cliente");
		
		jmNuevo.add(jmiAgregarUnCliente);
		
		JMenuItem jmiAgregarUnaOperacion = new JMenuItem("Agregar una Operacion");
		jmNuevo.add(jmiAgregarUnaOperacion);
		
		JMenu Catalogos = new JMenu("Catalogos");
		jmbPrincipal.add(Catalogos);
		
		JMenuItem jmiConsultaDeClientes = new JMenuItem("Consulta de Clientes");
		jmiConsultaDeClientes.setToolTipText("Consultar un cliente por su nombre");
		Catalogos.add(jmiConsultaDeClientes);
		
		JMenuItem jmiConsultaPorCedula = new JMenuItem("Consulta por Cedula");
		jmiConsultaPorCedula.setToolTipText("Buscar un cliente por numero de cedula");
		Catalogos.add(jmiConsultaPorCedula);
		
		JMenuItem jmiConsultaDeRecibos = new JMenuItem("Consulta de Recibos");
		jmiConsultaDeRecibos.setToolTipText("Consultar un recibo por numero consecutivo");
		Catalogos.add(jmiConsultaDeRecibos);
		
		
	}/*fin de creacion de ventana*/
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		
	}/*fin de eventos*/

}/*fin de clase*/
