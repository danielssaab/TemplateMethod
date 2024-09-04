import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoRetiradaTest {

	@Test
	void deveRetornarDetalhesPedidoRetirada() {
		PedidoRetirada pedido = new PedidoRetirada();
		pedido.setNumeroPedido(101);
		pedido.setCliente("Carlos");
		pedido.setValor(50.0);
		assertEquals("PedidoRetirada{numeroPedido=101, cliente='Carlos', detalhes='Pizza preparada, Valor total: R$ 50.0, Pedido disponível para retirada'}", pedido.getInfo());
	}
}