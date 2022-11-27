package pattern;

public class Teste {
	public static void main(String[] args) {
		Compra copo1 = new Copo();
		Compra copo2 = new Prato();
		Compra prato = new Prato();

		Sacola sacola = new Sacola();
		sacola.add(copo1);
		sacola.add(copo2);
		sacola.add(prato);

		sacola.buy();

		sacola.add(copo1);
		sacola.add(prato);

		sacola.buy();
	}
}
