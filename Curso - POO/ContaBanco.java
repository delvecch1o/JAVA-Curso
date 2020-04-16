package aula05a;

public class ContaBanco {

	public static void main(String[] args) {
		
		atributosConta p1 = new atributosConta ();
		p1.setNumConta (111111);
		p1.setDono("Robervaldo");
		p1.abrirConta("CC");
		
		p1.depositar(300);
		p1.sacar(350);
		p1.fecharConta();
		p1.estadoAtual();
		
		
		atributosConta p2 = new atributosConta();
		p2.setNumConta(2222);
		p2.setDono("Cleonice");
		p2.abrirConta("CP");
		
		p2.depositar(500);
		p2.sacar(1000);
		p2.estadoAtual();
		
	}
	
}
