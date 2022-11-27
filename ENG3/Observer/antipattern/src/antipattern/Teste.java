package antipattern;

public class Teste {

	public static void main(String args[]) {
		Novas novas = new Novas();

		Calculo inicio = new Inicio();
		novas.add(inicio);

		Calculo dobro = new Dobro();
		novas.add(dobro);

		Calculo triplo = new Triplo();
		novas.add(triplo);

		novas.setState(15);
		System.out.println("Origem: 15");
		novas.notificarTodos();

		novas.setState(30);
		System.out.println("Origem: 30");
		novas.notificarTodos();

		novas.setState(45);
		System.out.println("Origem: 45");
		novas.notificarTodos();
	}

}
