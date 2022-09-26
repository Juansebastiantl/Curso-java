import java.util.Scanner;

public class Evalua_edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lectura = new Scanner(System.in);
		
		System.out.println("Escriba su edad por favor ");
		
		int edad = lectura.nextInt();
		
		if(edad >= 18 ) {
			System.out.println("Usted es mayor de edad");
		}
		
		else {
			System.out.println("Usted es menor de edad");
		}
	}

}
