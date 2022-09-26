import javax.swing.JOptionPane;

public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave = "Juan";
		String pass= "";
		
		while (clave.equals(pass)== false) {
			pass = JOptionPane.showInputDialog("Introduce la clave por favor:");
			
			if(clave.equals(pass)== false){
				
				System.out.println("La clave es incorrecta");
				
			}
			
			else{
				
				System.out.println("La clave es correcta");
				
			}
			
			
			
		}

	}

}
