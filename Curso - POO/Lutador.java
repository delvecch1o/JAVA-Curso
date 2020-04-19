package aula07;

public class Lutador {
	
	// Atributos
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	// Métodos Públicos 
	
	public void apresentar () {
		System.out.println("-------------------------------------------");
		System.out.println("CHEGOU A HORA !!! Apresentamos o lutador " + this.getNome());
		System.out.println("Diretamente da " + this.getNacionalidade());
		System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + "m");
		System.out.println("pesando " + this.getPeso() + " kg");
		System.out.println(this.getVitorias() + " vitorias");
		System.out.println(this.getDerrotas() + " derrotas e ");
		System.out.println(this.getEmpates() + " empates!");
		
		
	}
	
	public void Status () {
		System.out.println(this.getNome() + " é um peso " + this.getCategoria());
		System.out.println("Ganhou " +  this.getVitorias() + " vezes");
		System.out.println("Perdeu " +  this.getDerrotas() + " vezes");
		System.out.println("Empatou " + this.getEmpates() + " vezes");
	}
	
	public void ganharLuta () {
		this.setVitorias (this.getVitorias() + 1); // ou this.vitorias = this.vitorias + 1;
	}
	
	public void perderLuta () {
		this.setDerrotas (this.getDerrotas() + 1);
	}
	
	public void empatarLuta () {
		this.setEmpates(this.getEmpates() + 1);
	}
	
	
	// Métodos Especiais construtores 
	
	public Lutador (String no,String na, int id, float al, float pe, int vi, int de, int em) {
		this.nome = no; // nome é o atributo , no é o parametro 
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso (pe);
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;
	}
	
	// Métodos especiais get && set
	
	public String getNome () {
		return this.nome;
	}
	
	public void setNome (String no) {
		this.nome = no;
	}
	
	public String getNacionalidade () {
		return this.nacionalidade;
	}
	
	public void setNacionalidade (String na) {
		this.nacionalidade = na;
	}
	
	public int getIdade () {
		return this.idade;
	}
	
	public void setIdade (int id) {
		this.idade = id;
	}
	
	public float getAltura () {
		return this.altura;
	}
	
	public void setAltura (float al) {
		this.altura = al;
	}
	
	public float getPeso () {
		return this.peso;
		
	}
	
	public void setPeso (float pe) {
		this.peso = pe;
		this.setCategoria();
	}
	
	public String getCategoria () {
		return this.categoria;
	}
	
	private void setCategoria () {
		if (this.peso < 52.2) {
			this.categoria = "Invalido";
		} else if (this.peso <= 70.3) {
			this.categoria = "Leve";
		} else if (this.peso <= 83.9) {
			this.categoria = "Médio";
		} else if (this.peso <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Invalido";
		}
	}
	
	public int getVitorias () {
		return this.vitorias;
	}
	
	public void setVitorias (int vi) {
		this.vitorias = vi;
	}
	
	public int getDerrotas () {
		return this.derrotas;
	}
	
	public void setDerrotas (int de) {
		this.derrotas = de;
	}
	
	public int getEmpates () {
		return this.empates;
	}
	
	public void setEmpates (int em) {
		this.empates = em;
	}
	
}
