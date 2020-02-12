
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class altaCamion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					altaCamion frame = new altaCamion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public altaCamion() {
		setIconImage(Toolkit.getDefaultToolkit().getImage( altaCamion.class.getResource("/imagen/LOGO.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 596);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRelleneLosCampos = new JLabel("Rellene los campos");
		lblRelleneLosCampos.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblRelleneLosCampos.setBounds(27, 94, 240, 40);
		contentPane.add(lblRelleneLosCampos);
		
		JLabel lblAltaCamion = new JLabel("ALTA CAMION");
		lblAltaCamion.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblAltaCamion.setBounds(266, 16, 172, 47);
		contentPane.add(lblAltaCamion);
		
		JLabel lblPatente = new JLabel("PATENTE:");
		lblPatente.setBounds(27, 177, 94, 20);
		contentPane.add(lblPatente);
		
		JLabel lblAoPatentamiento = new JLabel("A\u00D1O PATENTAMIENTO");
		lblAoPatentamiento.setBounds(27, 220, 172, 20);
		contentPane.add(lblAoPatentamiento);
		
		JLabel lblMarca = new JLabel("MARCA");
		lblMarca.setBounds(27, 270, 69, 20);
		contentPane.add(lblMarca);
		
		JLabel lblModelo = new JLabel("MODELO");
		lblModelo.setBounds(27, 312, 69, 20);
		contentPane.add(lblModelo);
		
		JLabel lblTipoDeCarga = new JLabel("TIPO DE CARGA");
		lblTipoDeCarga.setBounds(27, 368, 138, 20);
		contentPane.add(lblTipoDeCarga);
		
		JLabel lblCapacidadMaxima = new JLabel("CAPACIDAD MAXIMA:");
		lblCapacidadMaxima.setBounds(27, 429, 172, 20);
		contentPane.add(lblCapacidadMaxima);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Granos", "Liquidos", "Conteiner"}));
		comboBox.setBounds(180, 365, 139, 26);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"FIAT ", "CHEVROLET", "MERCEDES BENZ", "FORD", "RENAULT", "IBECO"}));
		comboBox_1.setBounds(181, 267, 138, 26);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000"}));
		comboBox_2.setBounds(232, 217, 87, 26);
		contentPane.add(comboBox_2);
		
		textField = new JTextField();
		textField.setBounds(173, 312, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(173, 174, 146, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(201, 426, 118, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAceptar.setBounds(109, 479, 115, 29);
		contentPane.add(btnAceptar);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			}
		});
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnVolver.setBounds(562, 479, 115, 29);
		contentPane.add(btnVolver);
	}
}
