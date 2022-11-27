package antipattern;

public class Triplo implements Calculo {

	public void update(int state) {
		System.out.println("Triplo: " + Integer.toString(state * 3));
	}

}
