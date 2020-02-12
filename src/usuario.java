package clases;
import java.sql.Date;
import java.util.Calendar;

public class usuario {

	public usuario() {
	}
	
	public usuario(String nroCui, String pass, int idRol, Date date, String estado) {
		this.nroCui = nroCui;
		this.pass = pass;
		this.idRol = idRol;
		this.fechaRegistro = date;
		this.estado = estado;
	}
	private String nroCui;
	private String pass;
	private int idRol;
	private Date fechaRegistro;
	private String estado;
	public String getNroCui() {
		return nroCui;
	}
	public void setNroCui(String nroCui) {
		this.nroCui = nroCui;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getIdRol() {
		return idRol;
	}
	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public  int conprobarUsuario(String pwd, String user){
		
		if(pass.equals(pwd) && user.equals(nroCui)){
			return 1;
		}else{
			return 0;
		}
	}
	
}
