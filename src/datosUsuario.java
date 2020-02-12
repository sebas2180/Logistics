
public class datosUsuario {

	public datosUsuario(){
	}
		String usuario1 ="";
		String pss1 ="";
	
	public int probarPass(){
		usuario1=ventana1.txtUser.getText();
		pss1 = ventana1.txtPass.getText();
		if(usuario1.equals("sebas") && pss1.equals("1234")){
			return 1;
		}else{
			if(usuario1.equals("") || pss1.equals("")){
				return 2;
			}else{
				return 0;
			}
		}
		
		
	}
	
}

