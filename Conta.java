public class Conta {
    private Pedido pedido;
    private double total;
    private String status;

    public Conta(Pedido pedido) {
        this.pedido = pedido;
        this.total = pedido.calcularTotal();
        this.status = "PENDENTE";
    }

    public double getTotal() {
        return total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Pedido getPedido() {
        return pedido;
    }
}