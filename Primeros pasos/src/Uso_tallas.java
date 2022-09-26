
import java.util.*;
public class Uso_tallas {
	
	//enum Talla {MINI, MEDIANO, GRANDE,MUY_GRANDE};
	enum Talla {
		
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUYGRANDE("XL");
		private Talla(String abreviatura) {
			this.abreviatura = abreviatura;
		}
		
		public String get_abreviatura() {
			return abreviatura;
		}
		
		private String abreviatura;
		
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE: ");
		String entrada_datos = entrada.next().toUpperCase();
		Talla la_talla = Enum.valueOf(Talla.class, entrada_datos);
		System.out.println("Talla:" + la_talla);
		System.out.println("Abreviatura es igual "+ la_talla.get_abreviatura());
		
	}
	
	
}
