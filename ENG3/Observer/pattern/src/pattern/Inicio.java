package pattern;

public class Inicio extends Observer {
	public Inicio(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Inicio: " + Integer.toString(subject.getState()));
	}
}