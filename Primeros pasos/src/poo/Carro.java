package poo;

public class Carro {
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;
	
	public Carro(){
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
	}
	
	public String getLargo() {
		
		return "El largo del carro es " + largo;
	}
	
	public void setColor(String color_carro) {
		//color = "azul";
		color = color_carro;
	}

	public String getColor() {
		
		return "El color del carro es " + color;
	}

	public String getDatos() {
		
		return "La plataforma del vehiculo tiene:  " + ruedas + 
		" ruedas " + ". Mide " + largo/1000 + 
		" metros con un ancho de " + ancho + 
		" cm y un peso de plataforma de " + peso_plataforma + " kg";
	}
	
	public void set_asientos(String asientos_cuero) {
		if(asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero = true;
		}
		else {
			this.asientos_cuero = false;
		}
	
	}
	
	public String get_asientos() {
		if(asientos_cuero==true) {
			return "El carro tiene asientos de cuero";
		}
		else {
			return "El carro tiene asientos de serie";
		}
	}
	
	public void setClimatizador(String climatizador) {
		if(climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		}
		else {
			this.climatizador = false;
		}
	}
	
	public String getClimatizador() {
		if(climatizador == true) {
			return "El carro tiene asientos de climatizador";
		}
		else {
			return "El carro tiene aire acondicionado";
		}
	}
	
	//Setter y getter

	
	public String get_Pesocarro() {
		int peso_carroceria = 500;
		peso_total = peso_plataforma + peso_carroceria;
		
		if(asientos_cuero== true) {
			peso_total= peso_total + 50;
		}
		
		if(climatizador== true) {
			peso_total= peso_total + 20;
		}
		
		return "El peso total es: " + peso_total;
		
	}
	
	public int get_Preciofinal() {
		int precio_final = 10000;
		if(asientos_cuero== true) {
			precio_final+= 2000;
		}
		
		if(climatizador== true) {
			precio_final+= 1500;
		}
		
		return precio_final;
		
	}
	
	
	
	
}
