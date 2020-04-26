package aula011;

public class Bolsista extends Aluno {

	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + this.getNome());
	}
	
	@Override
	public void pagarMensalidade() { // no caso tem dois pagarMensalidade, no caso este esta sendo sobreposto 
		System.out.println(this.getNome() + " é bolsista! Pagamento facilitado");
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
	
	
}
