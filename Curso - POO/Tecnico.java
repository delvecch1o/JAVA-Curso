package aula011;

public class Tecnico extends Aluno {
	
	private String registroProfissional;
	
	public void Praticar() {
		System.out.println("Esta habilitado para exercer sua função " + this.getNome());
	}

	public String getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(String registroProfissional) {
		this.registroProfissional = registroProfissional;
	}
	
	
}
