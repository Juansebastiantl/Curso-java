package poo;

public class Furgoneta extends Carro {

	private int capacidad_carga;
	private int asientos_extra;
	
	public Furgoneta(int asientos_extra, int capacidad_carga) {
		super(); // llamar al constructor de la clase padre osea a Carro.
		this.asientos_extra = asientos_extra;
		this.capacidad_carga = capacidad_carga;
	}
	
	public String getDatosFurgoneta() {
		return " La capacidad de carga es: " + capacidad_carga + " y los asientos son: " + asientos_extra;
		}
}
