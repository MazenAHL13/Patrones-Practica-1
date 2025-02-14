import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
                Inventario inventario = new Inventario();

                Producto laptop = new Electronico(1500, 5);
                Producto camiseta = new Ropa(25, 10);
                Alimento leche = new Alimento(3, 20, LocalDate.of(2025, 3, 10));
                Alimento panCaducado = new Alimento(1, 15, LocalDate.of(2024, 1, 1)); // Caducado

                inventario.agregarProducto(laptop);
                inventario.agregarProducto(camiseta);
                inventario.agregarProducto(leche);
                inventario.agregarProducto(panCaducado);

                inventario.mostrarInventario();

                leche.guardarEnBodega();
                panCaducado.guardarEnBodega();
            }
        }
