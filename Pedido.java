import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Lanche> itens;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarLanche(Lanche lanche) {
        itens.add(lanche);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Lanche> getItens() {
        return itens;
    }

    public double calcularTotal() {
        double total = 0;
        for (Lanche l : itens) {
            total += l.getPreco();
        }
        return total;
    }
}