package ProjetoPessoa08;

public class ProjetoPessoa08 {

	public static void main(String[] args) {
		Pessoa [] p = new Pessoa [2];
		Livro [] l = new Livro [3];
		
		p[0] = new Pessoa ("Pedro", 22, "M");
		p[1] = new Pessoa ("Margarida", 25, "F");
		
		l[0] = new Livro ("Anne with an E", "Kathryn Borel", 450, p[0]);
		l[1] = new Livro ("Aprendendo Java", "Jose da Silva", 300, p[0]);
		l[2] = new Livro  ("POO para Iniciantes", "Pedro Paulo de Andrade", 500, p[1]);
		
		
		l[0].abrir();
		l[0].folhear(150);
		l[0].avancarPag();
		System.out.println(l[0].detalhes());
		
		
		l[1].abrir();
		l[1].folhear(29);
		l[1].avancarPag();
		System.out.println(l[1].detalhes());
	
	}

}
