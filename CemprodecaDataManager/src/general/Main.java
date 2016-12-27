package general;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Main implements ActionListener {
	
	JFrame VentanaMain;
	
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Main m = new Main();
		
	}
	
	public Main(){
	CrearVentanaPrincipal();
	}/*fin de constructor*/
	
	public void CrearVentanaPrincipal(){
		
		VentanaMain = new JFrame("CEMPRODECA");
		VentanaMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		VentanaMain.setBounds(100, 100, 800, 400);
		VentanaMain.setVisible(true);
		VentanaMain.setLayout(null);
		
		JMenuBar barraDeMenu = new JMenuBar();
		VentanaMain.setJMenuBar(barraDeMenu);
		
		JMenu jmNuevo = new JMenu("Nuevo");
		barraDeMenu.add(jmNuevo);
				
		JMenuItem jmiAgregarUnCliente = new JMenuItem("Agregar un Cliente");
		jmiAgregarUnCliente.addActionListener(this);
		jmNuevo.add(jmiAgregarUnCliente);
				
		JMenuItem jmiAgregarUnaOperacion = new JMenuItem("Agregar una Operacion");
		jmiAgregarUnaOperacion.addActionListener(this);
		jmNuevo.add(jmiAgregarUnaOperacion);
		
		
				
		JMenu jmCatalogos = new JMenu("Catalogos");
		barraDeMenu.add(jmCatalogos);
				
		JMenuItem jmiConsultaDeClientes = new JMenuItem("Consulta de Clientes");
		jmiConsultaDeClientes.setToolTipText("Consultar un cliente por su nombre");
		jmiConsultaDeClientes.addActionListener(this);
		jmCatalogos.add(jmiConsultaDeClientes);
				
		JMenuItem jmiConsultaPorCedula = new JMenuItem("Consulta por Cedula");
		jmiConsultaPorCedula.setToolTipText("Buscar un cliente por numero de cedula");
		jmiConsultaPorCedula.addActionListener(this);
		jmCatalogos.add(jmiConsultaPorCedula);
				
		JMenuItem jmiConsultaDeRecibos = new JMenuItem("Consulta de Recibos");
		jmiConsultaDeRecibos.setToolTipText("Consultar un recibo por numero consecutivo");
		jmiConsultaDeRecibos.addActionListener(this);
		jmCatalogos.add(jmiConsultaDeRecibos);
		VentanaMain.repaint();
		}/*fin de crear ventanas*/

	@Override
	public void actionPerformed(ActionEvent evento) {
		
	}
	
	
	
}/*fin de clase*/
