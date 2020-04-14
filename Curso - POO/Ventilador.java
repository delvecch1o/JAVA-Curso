package ExercicioAula02;

public class Ventilador {
	
	String modelo;
	String cor;
	int velocidade; 
	boolean parado;
	
	void status () {
		System.out.println("Modelo " + this.modelo);
		System.out.println("Um ventilador " + this.cor);
		System.out.println("Velocidade " + this.velocidade);
		System.out.println("O ventilador esta parado?" + this.parado);
	}
	
	void parado () {
		this.parado = true;
		
	}
	
	void girando () {
		this.parado = false;
		
	}
	
}
