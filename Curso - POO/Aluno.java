package aula011;

public class Aluno extends Pessoa {

	private int matricula;
	private String curso;
	
	public void pagarMensalidade() { // public void final pagarMensalidade() se eu colocar o final , ele nao pode ser mais sobreposto, pq o metodo final nao extende a mais nada
		System.out.println("Pagando mensalidade de aluno " + this.getNome());
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	/*
	 aluno tem tudo o que pessoa tem (nome, idade, sexo, fazer aniversario) + suas especialização
	 então
	 aluno é uma especialização de pessoa e
	 pessoa e uma gereneralização de aluno
	 */
}
