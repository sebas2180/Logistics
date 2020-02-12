import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.ResultSetMetaData;

import javax.swing.JTable;

public class informacionCliente extends JFrame {

	private JPanel contentPane;
	private JTable table;
	
	public usuario getUser() {
		return user;
	}
	public void setUser(usuario user) {
		this.user = user;
	}

	private usuario user;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					informacionCliente frame = new informacionCliente(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param nroCui 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	
	public informacionCliente(String nroCui) throws SQLException, InstantiationException, IllegalAccessException {
		final  MyDataAcces conexion = new MyDataAcces();
		setIconImage(Toolkit.getDefaultToolkit().getImage(informacionCliente.class.getResource("/imagen/LOGO.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 902, 694);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		ResultSet resultado;
		 System.out.println(nroCui+"			este");//borrar
    	resultado=(ResultSet) conexion.GetQuery("select* from Cliente where nroCui='"+nroCui+"'");	 
    	resultado=(ResultSet) conexion.GetQuery("select* from Cliente where nroCui='"+nroCui+"'");	 
		ResultSetMetaData rsmd =(ResultSetMetaData) resultado.getMetaData(); 
	
		int numCols = rsmd.getColumnCount();
		System.out.println(numCols);//borrar
		
		Object []datos = new Object[numCols];
		

				
		int idCliente = 0;
		String condicion = null ;
		String[] columnas={"Nombre", "Apellido","Pasatiempo"};  
		DefaultTableModel modelo = new DefaultTableModel ();
		modelo.setColumnIdentifiers(columnas);	    			
	    System.out.println("prueba 0");//borrar
	  
	     System.out.println(idCliente+"	"+condicion);
	                 
	    while(resultado.next()) {
	         for (int i=0;i<numCols;i++){
	        	if(resultado.getString("nroCui")!=null){
	             datos[i]= resultado.getObject(i+1);
	        	} 	
	            	}
	         modelo.addRow(datos);
	            table = new JTable();
	            table.setFont(new java.awt.Font("Tahoma", 1, 22)); 

	            table.setModel(modelo);
	            table.setBounds(47, 47, 802, 361);
	    		contentPane.add(table);
	    		
	    	
	    }
	            }
	
					
	
}

