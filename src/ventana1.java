

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import imagen.imagenes;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class ventana1 extends JFrame {

	private JPanel contentPane;
	public static JTextField txtUser;
	public static JPasswordField txtPass;
	public static int e=0;

	/**
	 * Launch the application.
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */

	public ventana1() throws InstantiationException, IllegalAccessException {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ventana1.class.getResource("/imagen/LOGO.png")));
		
		
		setTitle("LOGISTICS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 806, 659);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario: ");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblUsuario.setBounds(161, 229, 176, 59);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblContrasea.setBounds(161, 342, 131, 20);
		contentPane.add(lblContrasea);
		final datosUsuario data=new datosUsuario();
		final 	MyDataAcces conexion = new MyDataAcces();
		int  e=0;
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ResultSet resultado;
				resultado = conexion.GetQuery("Select * from usuario");
				try {
					boolean encontrado = false;
					while(encontrado == false && resultado.next()){
						usuario user1 = new usuario(resultado.getString("nroCui"),resultado.getString("contrasena"),resultado.getInt("idRol"),
								resultado.getDate("fechaRegistro"),resultado.getString("estado"));
						if(user1.conprobarUsuario(txtPass.getText(), txtUser.getText())==1){
							ventana2 window2 = new ventana2();
							logo window22 = new logo();
							window2.setUserr(user1);
							JOptionPane.showMessageDialog(null, "Beinvenido al sistema");
							ventana1.this.dispose();
							window2.setVisible(true);
							
							encontrado = true;
						}
					}
					if (encontrado == false){
						JOptionPane.showMessageDialog(null, "Usuario/contra  incorrectos");
						
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnEntrar.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnEntrar.setBounds(138, 466, 176, 47);
		contentPane.add(btnEntrar);
		
		JButton btnNewButton = new JButton("SALIR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(445, 466, 176, 47);
		contentPane.add(btnNewButton);
		
		txtUser = new JTextField();
		txtUser.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtUser.setBounds(380, 242, 246, 34);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		txtPass = new JPasswordField();
		txtPass.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtPass.setBounds(393, 337, 246, 34);
		contentPane.add(txtPass);
		
		JLabel lblIngreseElUsuario = new JLabel("Ingrese el usuario y contrase\u00F1a");
		lblIngreseElUsuario.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblIngreseElUsuario.setBounds(195, 132, 565, 47);
		contentPane.add(lblIngreseElUsuario);
		
		JLabel lblRecuerdeQueEl = new JLabel("Recuerde que el usuario es el nro de cui/cuil");
		lblRecuerdeQueEl.setForeground(Color.BLUE);
		lblRecuerdeQueEl.setBounds(30, 280, 246, 20);
		contentPane.add(lblRecuerdeQueEl);
		
		JButton btnSaltar = new JButton("SALTAR");
		btnSaltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ResultSet resultado;
				resultado = conexion.GetQuery("Select * from usuario");
				try {
					String cuit="20379909745";
					while(resultado.next()){
						usuario user1 = new usuario(resultado.getString("nroCui"),resultado.getString("contrasena"),resultado.getInt("idRol"),
								resultado.getDate("fechaRegistro"),resultado.getString("estado"));
						if(user1.conprobarUsuario("1234",cuit)==1){
							ventana2 window2 = new ventana2();
							logo window22 = new logo();
							window2.setUserr(user1);
							ventana1.this.dispose();
							window2.setVisible(true);
							
						}
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
			}
		});
		btnSaltar.setBounds(304, 558, 115, 29);
		contentPane.add(btnSaltar);
	}
}
