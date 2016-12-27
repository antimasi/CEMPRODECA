package general;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class GuiConsultaCliente {
	private JPanel panelConsultaCliente;
	private JTextField tfCedula, tfNombre, tfMontoInicial, tfFondo, tfNombreDelFondo,
	tfTasaDeInteres, tfPeriodicidadInteres, tfPeriodicidadAmortizacion;
	private JTable jtRecibos, jtPagos;
	
	public JPanel GeneraVentana() {
		
		panelConsultaCliente = new JPanel();
		panelConsultaCliente.setBounds(100, 100, 790, 400);
		
		panelConsultaCliente.setLayout(null);
		panelConsultaCliente.setLayout(null);
		JLabel lblCedula = new JLabel("Cedula:");
		lblCedula.setBounds(21, 7, 40, 17);
		panelConsultaCliente.add(lblCedula);
		
		tfCedula = new JTextField();
		tfCedula.setBounds(60, 5, 114, 21);
		tfCedula.setEditable(true);/*NO GUARDAR LA CEDULA EN ESTE CASO*/
		panelConsultaCliente.add(tfCedula);
		tfCedula.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(218, 15, 0, 0);
		panelConsultaCliente.add(label);
		
		JLabel lbNombre = new JLabel("Nombre:");
		lbNombre.setBounds(192, 7, 45, 17);
		panelConsultaCliente.add(lbNombre);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(244, 5, 148, 21);
		tfNombre.setEditable(true);/*NO GUARDAR EL NOMBRE*/
		panelConsultaCliente.add(tfNombre);
		tfNombre.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(392, 15, 0, 0);
		panelConsultaCliente.add(label_1);
		
		JLabel lblMontoInicial = new JLabel("Monto Inicial:");
		lblMontoInicial.setBounds(397, 7, 74, 17);
		panelConsultaCliente.add(lblMontoInicial);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(476, 15, 0, 0);
		panelConsultaCliente.add(label_2);
		
		tfMontoInicial = new JTextField();
		tfMontoInicial.setBounds(481, 5, 114, 21);
		tfMontoInicial.setEditable(false);
		panelConsultaCliente.add(tfMontoInicial);
		tfMontoInicial.setColumns(10);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(600, 15, 0, 0);
		panelConsultaCliente.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(605, 15, 0, 0);
		panelConsultaCliente.add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(733, 15, 0, 0);
		panelConsultaCliente.add(label_5);
		
		JLabel lblFondo = new JLabel("Fondo:");
		lblFondo.setBounds(476, 36, 44, 17);
		panelConsultaCliente.add(lblFondo);
		
		JLabel label_6 = new JLabel("");
		label_6.setBounds(228, 41, 0, 0);
		panelConsultaCliente.add(label_6);
		
		tfFondo = new JTextField();
		tfFondo.setBounds(515, 34, 40, 21);
		tfFondo.setEditable(false);
		panelConsultaCliente.add(tfFondo);
		tfFondo.setColumns(10);
		
		JLabel lblNombreDelFondo = new JLabel("Nombre del Fondo:");
		lblNombreDelFondo.setBounds(192, 36, 102, 17);
		panelConsultaCliente.add(lblNombreDelFondo);
		
		JLabel label_7 = new JLabel("");
		label_7.setBounds(459, 41, 0, 0);
		panelConsultaCliente.add(label_7);
		
		tfNombreDelFondo = new JTextField();
		tfNombreDelFondo.setBounds(296, 34, 175, 21);
		tfNombreDelFondo.setEditable(false);
		panelConsultaCliente.add(tfNombreDelFondo);
		tfNombreDelFondo.setColumns(10);
		
		JLabel label_8 = new JLabel("");
		label_8.setBounds(583, 41, 0, 0);
		panelConsultaCliente.add(label_8);
		
		JLabel label_9 = new JLabel("");
		label_9.setBounds(588, 41, 0, 0);
		panelConsultaCliente.add(label_9);
		
		JLabel label_10 = new JLabel("");
		label_10.setBounds(727, 41, 0, 0);
		panelConsultaCliente.add(label_10);
		
		JLabel label_11 = new JLabel("");
		label_11.setBounds(140, 67, 0, 0);
		panelConsultaCliente.add(label_11);
		
		JLabel label_12 = new JLabel("");
		label_12.setBounds(145, 67, 0, 0);
		panelConsultaCliente.add(label_12);
		
		JLabel lblTasa = new JLabel("Tasa:");
		lblTasa.setBounds(567, 38, 28, 17);
		panelConsultaCliente.add(lblTasa);
		
		JLabel label_13 = new JLabel("");
		label_13.setBounds(183, 67, 0, 0);
		panelConsultaCliente.add(label_13);
		
		tfTasaDeInteres = new JTextField();
		tfTasaDeInteres.setBounds(595, 34, 28, 21);
		tfTasaDeInteres.setEditable(false);
		panelConsultaCliente.add(tfTasaDeInteres);
		tfTasaDeInteres.setColumns(10);
		
		JLabel lblPeriodicidadDeInters = new JLabel("Periodicidad de inter\u00E9s:");
		lblPeriodicidadDeInters.setBounds(21, 36, 125, 17);
		panelConsultaCliente.add(lblPeriodicidadDeInters);
		
		JLabel label_14 = new JLabel("");
		label_14.setBounds(437, 67, 0, 0);
		panelConsultaCliente.add(label_14);
		
		tfPeriodicidadInteres = new JTextField();
		tfPeriodicidadInteres.setBounds(146, 34, 28, 21);
		tfPeriodicidadInteres.setEditable(false);
		panelConsultaCliente.add(tfPeriodicidadInteres);
		tfPeriodicidadInteres.setColumns(10);
		
		JLabel label_15 = new JLabel("");
		label_15.setBounds(561, 67, 0, 0);
		panelConsultaCliente.add(label_15);
		
		JLabel label_16 = new JLabel("");
		label_16.setBounds(566, 67, 0, 0);
		panelConsultaCliente.add(label_16);
		
		JLabel label_17 = new JLabel("");
		label_17.setBounds(571, 67, 0, 0);
		panelConsultaCliente.add(label_17);
		
		JLabel label_18 = new JLabel("");
		label_18.setBounds(576, 67, 0, 0);
		panelConsultaCliente.add(label_18);
		
		JLabel label_19 = new JLabel("");
		label_19.setBounds(581, 67, 0, 0);
		panelConsultaCliente.add(label_19);
		
		JLabel label_20 = new JLabel("");
		label_20.setBounds(586, 67, 0, 0);
		panelConsultaCliente.add(label_20);
		
		JLabel label_21 = new JLabel("");
		label_21.setBounds(591, 67, 0, 0);
		panelConsultaCliente.add(label_21);
		
		JLabel lblPeriodicidadDeAmortizacin = new JLabel("Periodicidad de Amortizaci\u00F3n:");
		lblPeriodicidadDeAmortizacin.setBounds(21, 65, 160, 17);
		panelConsultaCliente.add(lblPeriodicidadDeAmortizacin);
		
		JLabel label_22 = new JLabel("");
		label_22.setBounds(761, 67, 0, 0);
		panelConsultaCliente.add(label_22);
		
		JLabel label_23 = new JLabel("");
		label_23.setBounds(766, 67, 0, 0);
		panelConsultaCliente.add(label_23);
		
		tfPeriodicidadAmortizacion = new JTextField();
		tfPeriodicidadAmortizacion.setBounds(183, 63, 28, 21);
		tfPeriodicidadAmortizacion.setEditable(false);
		panelConsultaCliente.add(tfPeriodicidadAmortizacion);
		tfPeriodicidadAmortizacion.setColumns(10);;
		DefaultTableModel model = new DefaultTableModel();
		
		model.addColumn("Nombre");
		
		JLabel label_24 = new JLabel("");
		label_24.setBounds(438, 93, 0, 0);
		panelConsultaCliente.add(label_24);
		
		JLabel label_25 = new JLabel("");
		label_25.setBounds(443, 93, 0, 0);
		panelConsultaCliente.add(label_25);
		
		JLabel label_26 = new JLabel("");
		label_26.setBounds(448, 93, 0, 0);
		panelConsultaCliente.add(label_26);
		
		JLabel label_27 = new JLabel("");
		label_27.setBounds(453, 93, 0, 0);
		panelConsultaCliente.add(label_27);
		
		JLabel label_28 = new JLabel("");
		label_28.setBounds(458, 93, 0, 0);
		panelConsultaCliente.add(label_28);
		
		JLabel label_29 = new JLabel("");
		label_29.setBounds(463, 93, 0, 0);
		panelConsultaCliente.add(label_29);
		
		JLabel label_30 = new JLabel("");
		label_30.setBounds(468, 93, 0, 0);
		panelConsultaCliente.add(label_30);
		
		JLabel lblNumeroDeOperacion = new JLabel("Numero de Operacion");
		lblNumeroDeOperacion.setBounds(635, 7, 121, 17);
		panelConsultaCliente.add(lblNumeroDeOperacion);
		
		JList jlistOperaciones = new JList();
		jlistOperaciones.setBounds(635, 27, 134, 50);
		panelConsultaCliente.add(jlistOperaciones);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 89, 764, 270);
		panelConsultaCliente.add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JTabbedPane tpPestañas = new JTabbedPane(JTabbedPane.TOP);
		panel.add(tpPestañas, "name_6833940426624");
		
		JPanel jpTablaPagos = new JPanel();
		tpPestañas.addTab("Tabla de Pagos", null, jpTablaPagos, null);
		jpTablaPagos.setLayout(null);
		
		JScrollPane spPagos = new JScrollPane();
		spPagos.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		spPagos.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		spPagos.setBounds(0, 0, 759, 241);
		jpTablaPagos.add(spPagos);
		
		jtPagos = new JTable();
		jtPagos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Cuota", "Fecha de pago", "Amortizacion", "Intereses", "Saldo"
			}
		) {
			/**
			 * 
			 */
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, Double.class, Double.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		jtPagos.getColumnModel().getColumn(1).setPreferredWidth(125);
		jtPagos.getColumnModel().getColumn(2).setPreferredWidth(127);
		jtPagos.getColumnModel().getColumn(3).setPreferredWidth(115);
		jtPagos.getColumnModel().getColumn(4).setPreferredWidth(182);
		spPagos.setViewportView(jtPagos);
		
		JPanel jpRecibos = new JPanel();
		tpPestañas.addTab("Tabla de Recibos", null, jpRecibos, null);
		jpRecibos.setLayout(null);
		
		JScrollPane spRecibos = new JScrollPane();
		spRecibos.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		spRecibos.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		spRecibos.setBounds(0, 0, 759, 241);
		jpRecibos.add(spRecibos);
		
		jtRecibos = new JTable();
		jtRecibos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"OPD", "Cuota", "Fecha de Cuota", "Fecha de pago", "Amortizacion", "Amortizacion Pendiente", "Intereses", "Intereses pendientes", "Morosidad", "Poliza", "Tipo de pago", "Monto pagado", "Saldo"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Object.class, String.class, String.class, Double.class, Double.class, Double.class, Double.class, Double.class, Double.class, Integer.class, Double.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		jtRecibos.getColumnModel().getColumn(0).setPreferredWidth(52);
		jtRecibos.getColumnModel().getColumn(1).setPreferredWidth(60);
		jtRecibos.getColumnModel().getColumn(2).setPreferredWidth(141);
		jtRecibos.getColumnModel().getColumn(3).setPreferredWidth(144);
		jtRecibos.getColumnModel().getColumn(4).setPreferredWidth(114);
		jtRecibos.getColumnModel().getColumn(5).setPreferredWidth(165);
		jtRecibos.getColumnModel().getColumn(6).setPreferredWidth(147);
		jtRecibos.getColumnModel().getColumn(7).setPreferredWidth(140);
		jtRecibos.getColumnModel().getColumn(8).setPreferredWidth(118);
		jtRecibos.getColumnModel().getColumn(9).setPreferredWidth(117);
		jtRecibos.getColumnModel().getColumn(10).setPreferredWidth(141);
		jtRecibos.getColumnModel().getColumn(11).setPreferredWidth(132);
		jtRecibos.getColumnModel().getColumn(12).setPreferredWidth(170);
		spRecibos.setViewportView(jtRecibos);
		
		return panelConsultaCliente;

	}
	
}
