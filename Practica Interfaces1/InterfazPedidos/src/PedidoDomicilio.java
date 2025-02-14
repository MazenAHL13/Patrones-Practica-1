public class PedidoDomicilio implements Pedido{
    private Repartidor repartidor;
        public PedidoDomicilio(Repartidor repartidor) {
            this.repartidor = repartidor;
        }

        public void preparar() {
            System.out.println("Preparando pedido para domicilio...");
        }

        public void entregar() {
            System.out.println("Pedido listo para ser entregado a domicilio.");
            repartidor.repartir();
        }
    }

