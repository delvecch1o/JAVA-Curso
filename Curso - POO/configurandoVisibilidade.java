package aula03;

public class configurandoVisibilidade {

	public static void main(String[] args) {
		
		Caneta c1 = new Caneta();
		
		c1.modelo = "BIC cristal"; // dentro do meu metodo principal POSSO fazer uso dos metodos e atributos que sao PUBLICOS e PROTEGIDOS , mas NÂO dos PRIVADOS desde que sejam objetos dessa classe
		c1.cor = "Azul";
	//	c1.ponta = 0.5f ;
		c1.carga = 80;
	//	c1.tampada = false; // esta privada nesse momento
		c1.tampar(); // nesse momento dentro da classe os metodos tampar e destampar estao publicos, e como estao dentro da classe eles podem ser alterados
		c1.status();
		c1.rabiscar();

	}

}
