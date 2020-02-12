
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.UIManager;


import java.awt.Component;

public class ventana2 extends JFrame {

	private JPanel contentPane;
	private ventana1 window1;
	private usuario userr;
	public ventana2() throws InstantiationException, IllegalAccessException, SQLException {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ventana2.class.getResource("/imagen/LOGO.png")));
		this.window1=window1;
		
		setTitle("Logistics");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1199, 529);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(153, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Generar viajes");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comprobarCliente comprobarCliente1;
				try {
					if(userr.getIdRol()==2){
						JOptionPane.showMessageDialog(null, "este usuario no puede acceder a esta opcion");
					}else{
					comprobarCliente1 = new comprobarCliente();
					comprobarCliente1.setUser1(userr);
					comprobarCliente1.setIrGenerarReserva(true);
					comprobarCliente1.setVisible(true);}
					
				} catch (InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(41, 62, 333, 47);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Visualizar pedidos");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(41, 136, 333, 53);
		contentPane.add(btnNewButton_1);
		
		final gestionarPeones gestionarPeoness = new gestionarPeones();
		JButton btnNewButton_2 = new JButton("Gestionar peones");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(userr.getIdRol()==2){
					JOptionPane.showMessageDialog(null,"este usuario no puede acceder a esta opcion");
				}else{
					if(userr.getIdRol()==1){
					gestionarPeoness.setVisible(true);
					}
				}
			}
		});
		btnNewButton_2.setBounds(41, 220, 333, 47);
		contentPane.add(btnNewButton_2);
		final MyDataAcces ingreso = new MyDataAcces();
		final gestionarCliente window6 = new gestionarCliente();
		JButton btnNewButton_3 = new JButton("Gestionar clientes");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(userr.getIdRol()==2){
					JOptionPane.showMessageDialog(null,"este usuario no puede acceder a esta opcion");
				}else{
					if(userr.getIdRol()==1){
					window6.setVisible(true);
					}
				}
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3.setBounds(40, 301, 334, 47);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("Generar reportes de viajes de prox. 3 dias");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_5.setBounds(501, 148, 395, 47);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Marcar pedido entregado");
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_6.setBounds(511, 220, 385, 47);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Gestionar usuarios");
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_7.setBounds(504, 299, 392, 49);
		contentPane.add(btnNewButton_7);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setForeground(new Color(204, 0, 0));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSalir.setBounds(897, 404, 115, 29);
		contentPane.add(btnSalir);
		
		final gestionarCamiones gestionarCamionn = new gestionarCamiones();
		JButton btnGestionarCamiones = new JButton("Gestionar camiones");
		btnGestionarCamiones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(userr.getIdRol()==2){
						JOptionPane.showMessageDialog(null,"este usuario no puede acceder a esta opcion");
					}else{
						if(userr.getIdRol()==1){
							gestionarCamionn.setVisible(true);
						}
					}
				}
			}
		);
		btnGestionarCamiones.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnGestionarCamiones.setBounds(501, 62, 395, 47);
		contentPane.add(btnGestionarCamiones);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{btnNewButton_2, btnNewButton_3, btnNewButton_5, btnNewButton_6, btnNewButton_7, btnSalir, btnNewButton_1, btnNewButton}));
	}
	public usuario getUserr() {
		return userr;
	}
	public void setUserr(usuario userr) {
		this.userr = userr;
	}

}
