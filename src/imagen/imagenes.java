package imagen;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;



public class imagenes extends JPanel {

	ImageIcon imagen;
	String nombre;
	
	public  imagenes(String nombree,ImageIcon ima){
		this.imagen= ima;
		this.nombre=nombree;
	}
	public void paint(Graphics g){
		Dimension tamanio = getSize();
		imagen= new ImageIcon(getClass().getResource(nombre));
	 g.drawImage(imagen.getImage(),0, 0,null);
	 setOpaque(false);
	 super.paint(g);
	}
}
