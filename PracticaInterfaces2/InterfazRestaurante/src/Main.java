//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("El palacio del Mondongo");
        Restaurante restaurante = new Restaurante();
        Pedido mondongo2 = new PedidoEnMesa();
        Pedido mondongo1 = new PedidoParaLlevar();
        Repartidor Motorizado = new Motorizado();
        Pedido mondongo3 = new PedidoDomicilio(Motorizado);

        restaurante.gestionarPedido(mondongo2);


        }
    }
