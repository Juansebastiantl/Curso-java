package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Empleado empleado1 = new Empleado ("Juan", 85000, 1990, 12, 17);
		Empleado empleado2 = new Empleado ("Ana", 95000, 1995, 06, 17);
		Empleado empleado3 = new Empleado ("Martin", 105000, 2002, 03, 15);
		empleado1.setSueldo(5);
		empleado2.setSueldo(5);
		empleado3.setSueldo(5);
		
		System.out.println("Nombre :" + empleado1.getNombre() + " Sueldo " + empleado1.getSueldo()
		+ " Fecha de Alta: " + empleado1.getFecha());
		System.out.println("Nombre :" + empleado2.getNombre() + " Sueldo " + empleado2.getSueldo()
		+ " Fecha de Alta: " + empleado2.getFecha());
		System.out.println("Nombre :" + empleado3.getNombre() + " Sueldo " + empleado3.getSueldo()
		+ " Fecha de Alta: " + empleado3.getFecha());*/
		
		Jefatura jefe_RRHH = new Jefatura("Juancho", 85000, 1998, 12, 20);
		jefe_RRHH.setIncentivo(5000);
		System.out.println(jefe_RRHH.getSueldo());
		Empleado[] misEmpleados = new Empleado[6];
		misEmpleados[0] = new Empleado("Juan", 85000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("Ana", 95000, 1995, 06, 17);
		misEmpleados[2] = new Empleado("Martin", 105000, 2002, 03, 15);
		misEmpleados[3] = new Empleado("Alex");
		misEmpleados[4] = jefe_RRHH;
		misEmpleados[5] = new Jefatura("Maria", 200000, 2005, 03, 27);
		
		Jefatura jefa_finanzas = (Jefatura) misEmpleados[5];
		
		jefa_finanzas.setIncentivo(50000);
		
		for (int i=0; i<misEmpleados.length; i++)
		{
			misEmpleados[i].setSueldo(6);
		}
		
		//Jefatura jefa_compras = (Jefatura) misEmpleados[1];
		/*for (Empleado e: misEmpleados)
		{
			e.setSueldo(5);
		}*/
		
		/*for (int i=0; i<misEmpleados.length; i++)
		{
			System.out.println("Nombre :" + misEmpleados[i].getNombre() + " Sueldo " + misEmpleados[i].getSueldo()
			+ " Fecha de Alta: " + misEmpleados[i].getFecha());
		}*/
		
		for (Empleado e: misEmpleados )
		{
			System.out.println("Nombre :" + e.getNombre() + " Sueldo " + e.getSueldo()
			+ " Fecha de Alta: " + e.getFecha());
		}
		

	}
	


}

class Empleado{
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		altaContrato = calendario.getTime();
		}
	
	public Empleado(String nom) {
		this(nom, 30000,2000,01,01);
	}
	
	
	public String getNombre() {
	return nombre;
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
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
	
	
}

 class Jefatura extends Empleado {
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
		
	}
	
	public void setIncentivo(double b ) {
		
		incentivo = b;
	}
	
	public double getSueldo() {
		double sueldoJefe = super.getSueldo();
		return sueldoJefe + incentivo;
	}
	private double incentivo;
	
	
}


