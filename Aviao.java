package desafioSantander03;

public class Aviao implements Voador{
	
	private int horasDeVoo = 0;

	public int getHorasDeVoo() {
		return horasDeVoo;
	}

	public void setHorasDeVoo(int horasDeVoo) {
		this.horasDeVoo = horasDeVoo;
	}

	@Override
	public void voar() {
		this.horasDeVoo += 13;
		System.out.printf("Estou voando como um avi�o, e tenho %d horas de voo %n", this.horasDeVoo);
		
	}
	
	

}
