package aula13;

public class Aula13 {

	public static void main(String[] args) {
		// Programa Principal
		
		Cachorro c = new Cachorro();
		c.reagir("Vai Apanhar");
		c.reagir("Toma comida");
		c.reagir(11,45);
		c.reagir(19,00);
		System.out.println();
		c.reagir(true);
		c.reagir(false);
		System.out.println();
		c.reagir(2, 12.5f);
		c.reagir(17, 4.5f);
		
	}

}
