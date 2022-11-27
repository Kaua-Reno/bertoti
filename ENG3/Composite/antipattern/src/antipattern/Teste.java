package antipattern;

public class Teste {
	public static void main(String[] args) {
		Copo copo1 = new Copo();
		Copo copo2 = new Copo();
		Prato prato = new Prato();

		Carrinho carrinho = new Carrinho();
		carrinho.addCopo(copo1);
		carrinho.addCopo(copo2);
		carrinho.addPrato(prato);

		carrinho.buy();

		carrinho.addCopo(copo1);
		carrinho.addPrato(prato);

		carrinho.buy();
	}
}
