public class BicicletaCompartida implements TransportePublico{
    private int tarifa = 5;
    private String origen;
    private String destino;

    public void iniciarViaje(String origen, String destino) {
        System.out.println("Bicicleta Compartida iniciando...");

    }

    public int calcularTarifa() {
        System.out.println("Bicicleta Compartida Tarifa calculada");

        return  tarifa;
    }
}
