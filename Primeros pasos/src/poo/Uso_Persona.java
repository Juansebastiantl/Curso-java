package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Persona[] lasPersonas = new Persona[2];
			lasPersonas[0] = new Empleado2("Juan", 3000, 1998, 05, 03);
			lasPersonas[1]=new Alumno("Pedro", "Ingenieria");
			
			for(Persona P: lasPersonas) {
				System.out.println(P.getNombre() + ", "+ P.getDescripcion());
			}
		
	}

}


abstract class Persona{
	public Persona(String nom) {
		nombre= nom;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public abstract String getDescripcion();
	private String nombre;	
}

class Empleado2 extends Persona{
	
	
	public Empleado2(String nom, double sue, int agno, int mes, int dia) {
		super(nom);
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		altaContrato = calendario.getTime();
		}
	
	public String getDescripcion() {
		return "Este empleado tiene un sueldo = " + sueldo;
	}
	
	public  double getSueldo() {
	return sueldo;
	}
	
	public Date getFecha() {
	return altaContrato;
	}
	
	public void setSueldo(double porcentaje) {
	double aumento = sueldo*porcentaje/100;
	sueldo+= aumento;
	}
	

	private double sueldo;
	private Date altaContrato;
	
	
	
}

class Alumno extends Persona{

	public Alumno(String nom, String car) {
		super(nom);
		carrera = car;
	}
	public String getDescripcion() {
		return "Este alumno pertence a la carrera de = " + carrera;
	}
	
	
	private String carrera;
}
	
