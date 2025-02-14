public class PedidoEnMesa implements Pedido {
        public void preparar() {
            System.out.println("Preparando mondongo para servir en mesa...");
        }

        public void entregar() {
            System.out.println("Mondongo entregado en la mesa del cliente.");
        }
    }
