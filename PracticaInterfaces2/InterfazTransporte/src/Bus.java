public class Bus implements TransportePublico{
    private int tarifa = 2;
    private String origen;
    private String destino;


    public void iniciarViaje(String origen, String destino) {
        System.out.println("Bus Iniciando Viaje");

    }

    public int calcularTarifa() {
        System.out.println("Bus Tarifa calculada");
        return tarifa;
    }
}
