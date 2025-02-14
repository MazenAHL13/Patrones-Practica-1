import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    List<Pedido> pedido;

    public Restaurante() {
        this.pedido = new ArrayList<>();
    }
        public void recibirPedido (Pedido pedidos){
            pedido.add(pedidos);
            System.out.println("tenemos nuevo pedido");

        }

        public void gestionarPedidos () {
            for (Pedido pedido : pedido) {
                pedido.preparar();
                pedido.entregar();

            }
        }
    }

