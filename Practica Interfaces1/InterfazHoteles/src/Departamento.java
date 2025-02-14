public class Departamento implements Reservable{
    @Override
    public void reservar(String fecha) {
        System.out.println("Departamento reservado");

    }

    @Override
    public void cancelarReserva() {
        System.out.println("Departamento cancelado");

    }
}
