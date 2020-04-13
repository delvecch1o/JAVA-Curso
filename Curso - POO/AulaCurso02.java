package aula02;

public class AulaCurso02 {

	public static void main(String[] args) {
		
		Caneta c1 = new Caneta ();
		System.out.println("---------CANETA c1------------");
		
		c1.cor = "Azul"; // atributos não tem os parenteses 
		c1.ponta = 0.5f;
		
		c1.tampar();
		c1.status(); // metodos tem os parenteses ();
		c1.rabiscar();
		
		Caneta c2 = new Caneta ();
		System.out.println("---------CANETA c2------------");
		c2.modelo = "Bic";
		c2.cor = "Preta";
		
		c2.destampar();
		c2.status();
		c2.rabiscar();
		
		
	}

}
