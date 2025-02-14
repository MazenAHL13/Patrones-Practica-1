public class Restaurante {
    public void gestionarPedido(Pedido pedido) {
        pedido.preparar();
        pedido.entregar();
    }

    public PedidoDomicilio asignarRepartidor(boolean esMotorizado) {
        Repartidor repartidor;
        if (esMotorizado) {
            repartidor = new Motorizado();
        } else {
            repartidor = new Ciclista();
        }
        return new PedidoDomicilio(repartidor);
    }
}

