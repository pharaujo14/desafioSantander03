package desafioSantander03;

public class VoadorApp {
	public static void main(String[] args) {
		
		Pato pato = new Pato();
		Aviao aviao = new Aviao();
		SuperHomem superman = new SuperHomem();
		TorreDeControle tc = new TorreDeControle(pato, aviao, superman);
		
		tc.voemTodos();
		System.out.println("------------------------------------");
		tc.voemTodos();
		System.out.println("------------------------------------");
		tc.voemTodos();
		System.out.println("------------------------------------");
		tc.voemTodos();
		System.out.println("------------------------------------");
		tc.voemTodos();
		System.out.println("------------------------------------");
		tc.voemTodos();
		System.out.println("------------------------------------");
		
	}

}
