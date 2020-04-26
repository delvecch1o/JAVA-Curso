package aula011;

public class Aula011 {

	public static void main(String[] args) {
	//	Pessoa p1 = new Pessoa(); não pode instanciar a CLASSE PESSOA, porque ela é abstrata
		
		Visitante v1 = new Visitante();
		v1.setNome("Joacir");
		v1.setIdade(36);
		v1.setSexo("M");
		v1.fazerAniversario();
		System.out.println(v1.toString());
		
		Aluno a1 = new Aluno();
		a1.setNome("Jeremias");
		a1.setMatricula(567);
		a1.setCurso("ADS");
		a1.setIdade(23);
		a1.setSexo("M");
		System.out.println(a1.toString());
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setMatricula(984);
		b1.setNome("Maria Luiza");
		b1.setBolsa(12.5f);
		b1.setSexo("F");
		System.out.println(b1.toString());
		b1.pagarMensalidade();
		
		Professor p1 = new Professor();
		p1.setNome("Hegeto");
		p1.setIdade(69);
		p1.setSexo("M");
		System.out.println(p1.toString());
		p1.setSalario(3.999f);
		
		Tecnico t1 = new Tecnico();
		t1.setNome("Rodrigo");
		t1.setIdade(33);
		t1.setSexo("M");
		t1.fazerAniversario();
		System.out.println(t1.toString());
		t1.setRegistroProfissional("Eletromecânico de Manutenção II");
		t1.Praticar();
		
		
		
	}

}
