package projetoyoutube;

public class ProjetoYoutube {

	public static void main(String[] args) {
		
		Video v[] = new Video [3];
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 12 de PHP");
		v[2] = new Video("Aula 10 de HTML5");
		
		Aspira a[] = new Aspira[2];
		a[0] = new Aspira("Robervaldo", 28, "M", "Napa");
		a[1] = new Aspira("Margarete", 17, "F", "topMar");
		

		Visualizacao vis[] = new Visualizacao[5];
		vis[0] = new Visualizacao(a[0], v[2]);// Robervaldo assiste video HTML5
		vis[0].avaliar();
		System.out.println(vis[0].toString());
		
		System.out.println();
		
		vis[1] = new Visualizacao(a[0], v[1]);// Robervaldo assiste video PHP
		vis[0].avaliar(87.0f);
		System.out.println(vis[1].toString());

	}

}
