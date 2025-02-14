public class PedidoDomicilio implements Pedido{
    public Repartidor repartidor;

    public PedidoDomicilio(Repartidor repartidor) {
        this.repartidor = repartidor;
    }

    public void preparar() {
        System.out.println("Preparando mondongo para Domicilio");
    }

    public void entregar() {
        System.out.println("Mondongo listo para ser entregado a domicilio.");
        repartidor.repartir();
    }
}

