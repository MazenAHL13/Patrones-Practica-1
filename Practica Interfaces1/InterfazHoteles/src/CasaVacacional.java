public class CasaVacacional implements Reservable{
    @Override
    public void reservar(String fecha) {
        System.out.println("Casa vacacional reservada");

    }

    @Override
    public void cancelarReserva() {
        System.out.println("Casa vacacional cancela");

    }
}
