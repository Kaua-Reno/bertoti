package pattern;

import java.util.ArrayList;
import java.util.List;

public class Sacola implements Compra {
	private List<Compra> compras = new ArrayList<Compra>();

	@Override
	public void buy() {
		for (Compra p : compras) {
			p.buy();
		}
		System.out.println("Compra realizada!");
		compras.clear();
	}

	public void add(Compra p) {
		this.compras.add(p);
	}

	public void remove(Compra p) {
		compras.remove(p);
	}

}
