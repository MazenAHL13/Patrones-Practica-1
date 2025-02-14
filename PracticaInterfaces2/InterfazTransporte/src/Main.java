//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TransportePublico taxi = new Taxi(10);
        TransportePublico bus = new Bus();
        TransportePublico bici = new BicicletaCompartida();
        Usuario usuario = new Usuario();

        usuario.solicitarViaje(taxi);
    }
}