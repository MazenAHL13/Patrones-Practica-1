//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("MazenInc");
        MetodoPago pago = new PayPal();
        Facturable factura = new FacturaElectronica();
        Compra compra = new Compra(pago, factura);
        compra.realizarCompra(100);

        }
    }