package projetopessoas;

public class Funcionario extends Pessoa {

	private String setor;
	private boolean trabalhando;
	
	public void mudaTrabalho() {
		this.trabalhando = ! this.trabalhando; // vai inverter se estava trabalhando, agr nao esta mais.
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean getTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}

}


