import java.io.InputStream;
import java.util.Locale;
import java.util.Scanner;

public class PrimeraClase {

	public static void main (String[]args) {
		
	
		//System.out.println(resultado);
		//Scanner entrada = new Scanner(System.in);
		//InputStream A;
		//A = System.in;
		//System.out.println(A);
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre_usuario=entrada.nextLine();
		System.out.println("Introduce edad");
		int edad=entrada.nextInt();
		System.out.println("Hola " + nombre_usuario + " el año que viene tendras "+ (edad +  1) + " años");
		
		
		
		
		

	}
	
} 
