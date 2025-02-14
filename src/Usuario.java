public class Usuario {
    public String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }
    public void hacerReserva(Reservable reserva) {
        reserva.reservar("13 de Febrero");

    }
    public void cancelarReserva(Reservable reserva) {
        reserva.cancelarReserva();

    }
}
