
public class Usuario {

    public void solicitarViaje(TransportePublico transporte) {
        System.out.println("Usuario ha solicitado un viaje.");
        transporte.iniciarViaje("origen", "destino");
        System.out.println("Costo estimado: $" + transporte.calcularTarifa());

    }
}
