package ProjetoPessoa08;

public class Livro implements Publicação {

	private String título;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	public String detalhes () {
		System.out.println("--------------------------------");
		return "Livro{" + "título=" + título + ", autor="
				+ autor + "\n, totPaginas=" + totPaginas
				+ ", pagAtual=" + pagAtual + ", aberto="
				+ aberto + "\n, leitor=" + leitor.getNome() +
				", idade=" + leitor.getIdade() +
				", sexo=" + leitor.getSexo() +'}';
			
	}
	
	
	public Livro (String título, String autor, int totPaginas, Pessoa leitor) {
		this.título = título;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}
	
	public String getTítulo () {
		return título;
	}
	public void setTítulo (String título) {
		this.título = título;
	}
	
	public String getAutor () {
		return autor;
	}
	public void setAutor (String autor) {
		this.autor = autor;
	}
	
	public int getTotPaginas () {
		return totPaginas;
	}
	public void setTotPaginas (int totPaginas) {
		this.totPaginas = totPaginas;
	}
	
	public int getpagAtual () {
		return pagAtual;
	}
	public void setpagAtual (int pagAtual) {
		this.pagAtual = pagAtual;
	}
	
	public boolean getAberto () {
		return aberto;
	}
	public void setAberto (boolean aberto) {
		this.aberto = aberto;
	}
	
	public Pessoa getLeitor () {
		return leitor;
	}
	public void setLeitor (Pessoa leitor) {
		this.leitor = leitor;
	}


	@Override
	public void abrir() {
		this.aberto = true;
		
	}


	@Override
	public void fechar() {
		this.aberto = false;
		
	}


	@Override
	public void folhear(int p) {
		if (p > this.totPaginas) {
			this.pagAtual = 0;
		} else {
			this.pagAtual = p;
		}
		
		
	}


	@Override
	public void avancarPag() {
		this.pagAtual++;
		
	}


	@Override
	public void voltarPag() {
		this.pagAtual--;
		
	}
	
	
}
