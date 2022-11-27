package antipattern;

public class Dobro implements Calculo {

	public void update(int state) {
		System.out.println("Dobro: " + Integer.toString(state * 2));
	}

}
