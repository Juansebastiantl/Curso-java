package poo;

public class ejemplo_constante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Empleados trabajador1 = new Empleados("Paco");
			Empleados trabajador2 = new Empleados("Ana");
			Empleados trabajador3 = new Empleados("Antonio");
			trabajador1.setSeccion("RRHH");
			
			//trabajador1.setNombre("Andres");
			
			/*System.out.println(trabajador1.getDatos());
			System.out.println(trabajador2.getDatos());
			System.out.println(trabajador3.getDatos());*/
			
			System.out.println(trabajador1.getDatos() + "\n" + trabajador2.getDatos() +
			"\n" + trabajador3.getDatos());
			System.out.println(Empleados.getIdSiguiente());
			
	}

}


class Empleados{
	
	public Empleados(String nom) {
		
		nombre= nom;
		seccion = "Administracion";
		//this.Id = Id; Esto no se haria porque ya no le pasariamos id cada empleado solo puede tener un id
		Id=IdSiguiente;
		IdSiguiente++;
		
	}
	
	//Un nombre no se debe cambiar por eso le agregamos final en nombre
	/*public void setNombre(String nom) {
		nombre = nom;
	}
	*/
	
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public String getDatos() {
		return "El nombre es: " + nombre + " la seccion es: " + seccion + " Y el id es: " + Id;
	}
	
	
	public static String getIdSiguiente() {
		
		return "El ID siguiente es: " + IdSiguiente;
	}
	
	
	
	private final String nombre;
	private String seccion;
	
	private int Id;
	private static int IdSiguiente =1;
}