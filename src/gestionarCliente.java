import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JLabel;

public class gestionarCliente extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gestionarCliente frame = new gestionarCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws SQLException 
	 */
	public gestionarCliente() throws InstantiationException, IllegalAccessException, SQLException {
		setIconImage(Toolkit.getDefaultToolkit().getImage(gestionarCliente.class.getResource("/imagen/LOGO.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 893, 672);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton btnNewButton = new JButton("Alta cliente");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				altaCliente altaClientee = new altaCliente();
				altaClientee.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(228, 144, 392, 54);
		contentPane.add(btnNewButton);
		
		final comprobarCliente window7 = new comprobarCliente();
		JButton btnNewButton_1 = new JButton("Visualizar cliente");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window7.setIrGenerarReserva(false);
				window7.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(228, 246, 392, 54);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Volver");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_2.setBounds(639, 496, 217, 42);
		contentPane.add(btnNewButton_2);
		
		JLabel label = new JLabel("");
		label.setBounds(60, 70, 69, 20);
		contentPane.add(label);
	}
}
