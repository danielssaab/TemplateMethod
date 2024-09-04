public abstract class Pedido {

	private int numeroPedido;
	protected String cliente;
	private double valor;

	public int getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public final String finalizarPedido() {
		String detalhes = prepararPedido();
		detalhes += ", " + calcularValorFinal();
		detalhes += ", " + informarEntrega();
		return detalhes;
	}

	protected abstract String prepararPedido();

	protected abstract String calcularValorFinal();

	protected abstract String informarEntrega();

	public abstract String getTipo();

	public String getInfo() {
		return getTipo() + "{" +
			"numeroPedido=" + this.numeroPedido +
			", cliente='" + this.cliente + '\'' +
			", detalhes='" + this.finalizarPedido() + '\'' +
			'}';
	}
}