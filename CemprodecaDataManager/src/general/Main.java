package general;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Main implements ActionListener {
	
	JFrame VentanaMain = new JFrame("CEMPRODECA");
	
	JMenuItem jmiAgregarUnCliente, jmiAgregarUnaOperacion,jmiConsultaDeClientes,
	jmiConsultaPorCedula,jmiConsultaDeRecibos;
	
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
		VentanaMain.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
					/*se debe cerrar el Stream hacia la database aqui por si le dan a la x*/
					int op = JOptionPane.showConfirmDialog(null, "Desea Salir?", "Verificacion de cierre",JOptionPane.YES_NO_OPTION);
						if(op == JOptionPane.YES_OPTION){
							System.exit(0);
						}/*fin de verificacion de salida*/
				   }/*fin de windowClosing*/
			});/*cierre personalizado para presion de X*/
		
		JMenuBar jmbPrincipal = new JMenuBar();
		jmbPrincipal.setBounds(0,0,800,10);
		VentanaMain.setJMenuBar(jmbPrincipal);
		jmbPrincipal.repaint();
		
		JMenu jmNuevo = new JMenu("Nuevo");
		jmbPrincipal.add(jmNuevo);
		
		jmiAgregarUnCliente = new JMenuItem("Agregar un Cliente");
		jmiAgregarUnCliente.addActionListener(this);
		jmNuevo.add(jmiAgregarUnCliente);
		
		jmiAgregarUnaOperacion = new JMenuItem("Agregar una Operacion");
		jmiAgregarUnaOperacion.addActionListener(this);
		jmNuevo.add(jmiAgregarUnaOperacion);
		
		JMenu Catalogos = new JMenu("Catalogos");
		jmbPrincipal.add(Catalogos);
		
		jmiConsultaDeClientes = new JMenuItem("Consulta de Clientes");
		jmiConsultaDeClientes.setToolTipText("Consultar un cliente por su nombre");
		jmiConsultaDeClientes.addActionListener(this);
		Catalogos.add(jmiConsultaDeClientes);
		
		jmiConsultaPorCedula = new JMenuItem("Consulta por Cedula");
		jmiConsultaPorCedula.setToolTipText("Buscar un cliente por numero de cedula");
		jmiConsultaPorCedula.addActionListener(this);
		Catalogos.add(jmiConsultaPorCedula);
		
		jmiConsultaDeRecibos = new JMenuItem("Consulta de Recibos");
		jmiConsultaDeRecibos.setToolTipText("Consultar un recibo por numero consecutivo");
		jmiConsultaDeClientes.addActionListener(this);
		Catalogos.add(jmiConsultaDeRecibos);
		
		
	}/*fin de creacion de ventana*/
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		
		if(evento.getSource() == jmiAgregarUnCliente){
			
		}/*fin de agregar un cliente*/
		
		if(evento.getSource() == jmiAgregarUnaOperacion){
			
		}/*fin de agregar una opecion*/
		
		if(evento.getSource() == jmiConsultaDeClientes){
			
		}/*fin de consultar clientes*/
		
		if(evento.getSource() == jmiConsultaDeRecibos){
			
		}/*fin de consultar recibos*/
		
		if(evento.getSource() == jmiConsultaPorCedula){
			
		}/*fin de consultar por cedula*/
		
	}/*fin de eventos*/

}/*fin de clase*/
