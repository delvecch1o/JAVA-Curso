package aula04;

public class Principal {

	public static void main(String[] args) {
		Caneta c1 = new Caneta ("NIC", "Amarela", 0.4f);
		c1.status();
		
		System.out.println("-------------------------");
		
		Caneta c2 = new Caneta ("Chique", "Preta", 1.0f);
		c2.status();
	}

}



/*
//c1.setModelo("BIC"); // usando o metodo acessor
	c1.modelo = "BIC";
	
	c1.setPonta(0.5f);
//	c1.ponta = 0.5f; // esta dando erro pq ponta esta privado
	
	System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
*/