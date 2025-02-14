public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();

        Motorizado motorizado = new Motorizado();
        PedidoEnMesa pedido2 = new PedidoEnMesa();
        PedidoDomicilio pedido1 = new PedidoDomicilio(motorizado);
        Ciclista ciclista = new Ciclista();
        PedidoDomicilio pedido3 = new PedidoDomicilio(ciclista);
    }
}