package desafioSantander03;

public class SuperHomem implements Voador{
	
	private int experiencia = 0;
	
	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public void voar() {
		this.experiencia += 3;
		System.out.println("Estou voando como um campe�o, minha experi�ncia � de: " + this.experiencia);
		
	}

}
