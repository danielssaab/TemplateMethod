public class PedidoEntrega extends Pedido {

	private String endereco;

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	protected String prepararPedido() {
		return "Pizza preparada e embalada para entrega";
	}

	@Override
	protected String calcularValorFinal() {
		// Adiciona taxa de entrega ao valor
		return "Valor total com taxa de entrega: R$ " + (this.getValor() + 5.0);
	}

	@Override
	protected String informarEntrega() {
		return "Pedido será entregue em: " + this.endereco;
	}

	@Override
	public String getTipo() {
		return "PedidoEntrega";
	}
}
