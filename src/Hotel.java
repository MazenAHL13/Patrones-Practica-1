public class Hotel implements Reservable, Calificable{
    private int calificacion;

    @Override
    public void reservar(String fecha) {
        System.out.println("Hotel reservado");

    }

    @Override
    public void cancelarReserva() {
        System.out.println("Hotel cancelado");

    }

    @Override
    public int calificar(int estrellas) {
        return calificacion;
    }
}
