class PedidoEnMesa implements Pedido {
    public void preparar() {
        System.out.println("Preparando pedido para servir en mesa...");
    }

    public void entregar() {
        System.out.println("Pedido entregado en la mesa del cliente.");
    }
}
