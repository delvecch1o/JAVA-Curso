package projetopessoas;

public class ProjetoPessoas {

	public static void main(String[] args) {
		// Programa Principal
		
	Pessoa p1 = new Pessoa();
	Aluno p2 = new Aluno();
	Professor p3 = new Professor();
	Funcionario p4 = new Funcionario();
	
	p1.setNome("Rodrigo");
	p2.setNome("Joanistela");
	p3.setNome("Damaceno");
	p4.setNome("Dedão");
		
	p1.setSexo("M");
	p2.setSexo("F");
	p4.setIdade(55);
	
	p2.setCurso("Informatica");
	p3.setSalario(2500.75f);
	p4.setSetor("Estoque");
	
//	p1.receberAumento(550.20f);
//	p2.mudaTrabalho();
//	p4.cancelarMatricula();
	
	
	System.out.println(p1.toString());
	System.out.println(p2.toString());
	System.out.println(p3.toString());
	System.out.println(p4.toString());
	}

}
