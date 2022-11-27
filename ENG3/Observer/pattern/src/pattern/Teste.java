package pattern;

public class Teste {

	public static void main(String args[]) {
		Subject subject = new Subject();

		new Inicio(subject);
		new Dobro(subject);
		new Triplo(subject);

		System.out.println("Estado inicial: 15");
		subject.setState(15);
		System.out.println("Estado inicial: 30");
		subject.setState(30);
		System.out.println("Estado inicial: 45");
		subject.setState(45);
	}

}