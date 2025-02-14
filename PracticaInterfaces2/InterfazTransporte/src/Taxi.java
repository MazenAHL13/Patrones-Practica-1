public class Taxi implements TransportePublico, Conductor {
    private  int tiempoViaje;
    private int tarifaPorMin = 3;
    private String origen;
    private String destino;

    public Taxi(int tiempoViaje) {
        this.tiempoViaje = tiempoViaje;
    }

    public void iniciarViaje(String origen, String destino) {
        System.out.println("Taxi iniciando viaje");

    }

    public int calcularTarifa() {
        System.out.println("Taxi calculando tarifa");
        return tiempoViaje * tarifaPorMin;
    }

    public void aceptarPasajero() {
        System.out.println("Taxi aceptando pasajero");
    }

    public void finalizarViaje() {
        System.out.println("Taxi finalizando viaje");

    }
}
