package pattern;

public class Automovel {
	
	private Andar andar;
	
	public void setAutomovel(Andar andar) {
		this.andar = andar;
	}
	
	public void dirigirAutomovel() {
		this.andar.dirigirAutom();
	}

}
