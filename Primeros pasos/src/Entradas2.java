import javax.swing.JOptionPane;

public class Entradas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		
		String recepcion_edad= JOptionPane.showInputDialog("Introduce la edad, por favor");
		
		int edad = Integer.parseInt(recepcion_edad);
		edad ++;
		
		System.out.println("Hola " + nombre_usuario + " tendras " + edad + " años." );
		
		
	}


}
