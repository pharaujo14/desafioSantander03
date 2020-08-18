package desafioSantander03;

public class Pato implements Voador{
	
	private int energia = 100;

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	@Override
	public void voar() {
		this.energia -= 5;
		if (this.energia >= 5) {
			System.out.println("Estou voando como um pato, energia restante: " + this.energia);
		} else {
			System.out.println("N�o tenho energia suficiente para voar");
		}
		
		
		
		
	}
	
	

}
