package ProjetoPessoa08;

public class Livro implements Publica��o {

	private String t�tulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	public String detalhes () {
		System.out.println("--------------------------------");
		return "Livro{" + "t�tulo=" + t�tulo + ", autor="
				+ autor + "\n, totPaginas=" + totPaginas
				+ ", pagAtual=" + pagAtual + ", aberto="
				+ aberto + "\n, leitor=" + leitor.getNome() +
				", idade=" + leitor.getIdade() +
				", sexo=" + leitor.getSexo() +'}';
			
	}
	
	
	public Livro (String t�tulo, String autor, int totPaginas, Pessoa leitor) {
		this.t�tulo = t�tulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}
	
	public String getT�tulo () {
		return t�tulo;
	}
	public void setT�tulo (String t�tulo) {
		this.t�tulo = t�tulo;
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
