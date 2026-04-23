import java.util.LinkedList;
import java.util.Queue;

public class Cozinha {
    private Queue<Pedido> fila = new LinkedList<>();

    public void adicionarPedido(Pedido pedido) {
        fila.add(pedido);
    }

    public Pedido processarPedido() {
        return fila.poll();
    }
}