package aula07;

import java.util.Random;

public class Luta {
	// Atributos
	
	private Lutador desafiado; // desafiado vai ser uma instancia da classe Lutador, do objeto Lutador
	private Lutador desafiante;
	private int rounds;
	private boolean aprovado;
	
	
	// Métodos Publicos
	
	public void marcarLuta (Lutador l1, Lutador l2) {
		if (l1.getCategoria() == l2.getCategoria() && (l1 != l2)) {  // ou (l1.getCategoria().equals(l2.getCategoria()))
			this.aprovado = true;
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			this.aprovado = false;
			this.desafiado = null;
			this.desafiante = null;
		}
		
	}
	
	public void lutar () {
		if (this.aprovado) {
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			System.out.println("### DESAFIANTE ###");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random ();
			int vencedor = aleatorio.nextInt(3); // 0 1 2 
			System.out.println("======RESULTADO DA LUTA======");
			
			switch (vencedor) {
			
			case 0: // Empate
				System.out.println("Empatou"); 
			this.desafiado.empatarLuta();
			this.desafiante.empatarLuta();
			break;
			
			case 1: // Ganhou Desafiado
				System.out.println("Vitoria do  " + this.desafiado.getNome()); 
			this.desafiado.ganharLuta();
			this.desafiante.perderLuta();
			break;
			
			case 2: // Ganhou Desafiante
				System.out.println("Vitoria do " + this.desafiante.getNome());
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
			break;
			
			
			}
			
			System.out.println("===============================");
			
			
			
		} else {
			System.out.println("A luta não pode acontecer! ");
		}
		
	}
	
	// Metodos Especiais get && set
	
	public Lutador getDesafiado () {
		return this.desafiado;
	}
	public void setDesafiado (Lutador dd) {
		this.desafiado = dd;
	}
	
	public Lutador getDesafiante () {
		return this.desafiante;
	}
	
	public void setDesafiante (Lutador dt) {
		this.desafiante = dt;
	}
	
	public int getRounds () {
		return this.rounds;
	}
	
	public void setRounds (int r) {
		this.rounds = r;
	}
	
	public boolean getAprovado () {
		return this.aprovado;
	}
	
	public void setAprovado (boolean a) {
		this.aprovado = a;
	}
	
}
