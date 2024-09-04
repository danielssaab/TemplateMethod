public class PedidoRetirada extends Pedido {

	@Override
	protected String prepararPedido() {
		return "Pizza preparada";
	}

	@Override
	protected String calcularValorFinal() {
		return "Valor total: R$ " + this.getValor();
	}

	@Override
	protected String informarEntrega() {
		return "Pedido disponível para retirada";
	}

	@Override
	public String getTipo() {
		return "PedidoRetirada";
	}
}