package poo;
import javax.swing.*;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Carro micarro = new Carro(); //instanciar clase
		Furgoneta furgoneta = new Furgoneta(4,4);
		
		micarro.setColor(JOptionPane.showInputDialog("Introduce color: "));
		micarro.set_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero: "));
		micarro.setClimatizador(JOptionPane.showInputDialog("Tiene asientos de climatizador:"));
		//System.out.println(micarro.getColor());
		//System.out.println(micarro.getDatos());
		System.out.println(micarro.get_asientos());
		System.out.println(micarro.getClimatizador());
		System.out.println(micarro.get_Pesocarro());
		System.out.println(micarro.get_Preciofinal());
		System.out.println(furgoneta.get_Preciofinal());*/
		Carro micarro1 = new Carro(); //instanciar clase
		micarro1.setColor("Rojo");
		Furgoneta furgoneta1 = new Furgoneta(4,500);
		furgoneta1.setColor("Azul");
		furgoneta1.set_asientos("Si");
		furgoneta1.setClimatizador("Si");
		System.out.println(micarro1.getDatos() +" "+ micarro1.getColor());
		System.out.println(furgoneta1.getDatos() + furgoneta1.getDatosFurgoneta());
		
		
	}

}
