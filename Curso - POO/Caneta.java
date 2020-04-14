package aula03;

public class Caneta {
	
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	public void status () {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println(" esta tampada? " + this.tampada);
	}
	
	public void rabiscar () {
		if (this.tampada == true) {
			System.out.println("ERRO! Nao posso rabiscar");
		
		} else {
			System.out.println("Estou rabiscando");
		}

	}
	
	public void tampar () {
		this.tampada = true; // this � uma referencia ao propio objeto	q � chamado,quando se quer mudar um atributo dentro da propria classe coloque a palavra this na frente da linha que vai mexer nesse atributo.
		
	}

	 public void destampar () {
		this.tampada = false;
		
	}
}	


