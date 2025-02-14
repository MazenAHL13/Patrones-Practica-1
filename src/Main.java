//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Reservable hotel = new Hotel();
        Reservable departamento = new Departamento();
        Reservable casa = new CasaVacacional();

        Usuario usuario = new Usuario("juan");

        usuario.hacerReserva(hotel);
        usuario.hacerReserva(departamento);
        usuario.cancelarReserva(casa);

    }
}