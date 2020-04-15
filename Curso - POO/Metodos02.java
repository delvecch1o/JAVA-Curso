package ExercicioAula02;

public class Metodos {

	public static void main(String[] args) {
		
		Ventilador v1 = new Ventilador ();
		System.out.println("----------Ventilador v1----------");
		
		v1.modelo = "Mundial" ;
		v1.cor = "Preto" ;
		v1.velocidade = 3;
		
		v1.parado();
		v1.status ();
		
		Ventilador v2 = new Ventilador ();
		System.out.println("----------Ventilador v2----------");
		
		v2.modelo = "Britania" ;
		v2.cor = "Branco" ;
		v2.velocidade = 1;
		
		v2.girando();
		v2.status();
		

	}

}
