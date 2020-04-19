package aula07;

public class Aula07 {

	public static void main(String[] args) {
		
		Lutador l[] = new Lutador [6];
				
				
		l[0] = new Lutador ("Juze Welingthon", "França", 31, 1.75f, 68.9f, 11, 3, 1);
		l[1] = new Lutador ("Jeremias", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);	
		l[2] = new Lutador ("Xandão", "EUA", 35, 1.65f, 80.9f, 13, 2, 1);
		l[3] = new Lutador ("Can Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
		l[4] = new Lutador ("Juse Diucer", "Brasil", 37, 1.70f, 119.3f, 5 , 4, 3);
		l[5] = new Lutador ("Pato Donald", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
		
		
		Luta UFC01 = new Luta ();
		UFC01.marcarLuta(l[0], l[1]);
		UFC01.lutar();
		System.out.println();
		l[0].Status();
		System.out.println();
		l[1].Status();
		System.out.println();
		
		UFC01.marcarLuta(l[4], l[5]);
		UFC01.lutar();
		
		/*
		l[0].apresentar();
		System.out.println();
		l[0].ganharLuta(); // tinha ganhado 11 + 1 = 12;
		l[0].Status();
		
		l[1].apresentar();
		System.out.println();
		l[1].Status();
		
		l[2].apresentar();
		System.out.println();
		l[2].Status();
		
		l[3].apresentar();
		System.out.println();
		l[3].Status();
		
		l[4].apresentar();
		System.out.println();
		l[4].Status();
		
		l[5].apresentar();
		System.out.println();
		l[5].Status();
		*/
		
		
	}

}
