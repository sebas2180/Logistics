package clases;

public class persona {

	private String nroCui;
	
	private String mail;
	public persona(String cui, String email) {
		this.nroCui=cui;
		
		this.mail=email;
	}
	public persona(){
		
	}
	public String getNroCui() {
		return nroCui;
	}
	public void setNroCui(String nroCui) {
		this.nroCui = nroCui;
	}
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}


}
