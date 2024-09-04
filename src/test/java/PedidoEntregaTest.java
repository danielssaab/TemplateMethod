import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoEntregaTest {

	@Test
	void deveRetornarDetalhesPedidoEntrega() {
		PedidoEntrega pedido = new PedidoEntrega();
		pedido.setNumeroPedido(102);
		pedido.setCliente("Ana");
		pedido.setValor(50.0);
		pedido.setEndereco("Rua das Flores, 123");
		assertEquals("PedidoEntrega{numeroPedido=102, cliente='Ana', detalhes='Pizza preparada e embalada para entrega, Valor total com taxa de entrega: R$ 55.0, Pedido será entregue em: Rua das Flores, 123'}", pedido.getInfo());
	}
}