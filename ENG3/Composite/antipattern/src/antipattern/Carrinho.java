package antipattern;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Copo> copos = new ArrayList<Copo>();
	private List<Prato> pratos = new ArrayList<Prato>();

	public void buy() {
		for (Copo can : copos) {
			can.buy();
		}
		for (Prato cad : pratos) {
			cad.buy();
		}
		System.out.println("Compra realizada!");
		copos.clear();
		pratos.clear();
	}

	public void addCopo(Copo c) {
		this.copos.add(c);
	}

	public void addPrato(Prato c) {
		this.pratos.add(c);
	}

	public void removeCopo(Copo c) {
		copos.remove(c);
	}

	public void removePrato(Prato c) {
		pratos.remove(c);
	}

}
