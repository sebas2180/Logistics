import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class posibilidadAgregarUsuario extends JFrame {

	private JPanel contentPane;

	public posibilidadAgregarUsuario() {
		this.setLocationRelativeTo(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage(posibilidadAgregarUsuario.class.getResource("/imagen/LOGO.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDeseaAgregarAl = new JLabel("Desea dar de alta al cliente?");
		lblDeseaAgregarAl.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDeseaAgregarAl.setBounds(93, 71, 355, 32);
		contentPane.add(lblDeseaAgregarAl);
		altaCliente window5 = new altaCliente();
		JButton btnSi = new JButton("Si");
		btnSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
				window5.setVisible(true);
			}
		});
		btnSi.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSi.setBounds(73, 146, 115, 29);
		contentPane.add(btnSi);
		
		JButton btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNo.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNo.setBounds(234, 146, 115, 29);
		contentPane.add(btnNo);
	}
}
