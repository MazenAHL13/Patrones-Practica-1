import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = Arrays.asList(
                new Producto("Audífonos", "Electrónica", 15),
                new Producto("Camiseta", "Ropa", 25),
                new Producto("Smartphone", "Electrónica", 800),
                new Producto("Libro", "Educación", 12),
                new Producto("Reloj de Lujo", "Accesorios", 200),
                new Producto("Teclado Mecánico", "Computación", 55)
        );

        UsuarioRegular user1 = new UsuarioRegular("Juan");
        UsuarioPremium user2 = new UsuarioPremium("Maria");

        SistemaRecomendaciones sistema = new SistemaRecomendaciones();

        sistema.generarRecomendaciones(user1, productos);
        sistema.generarRecomendaciones(user2, productos);

        sistema.mostrarRecomendaciones(user1);
        System.out.println();
        sistema.mostrarRecomendaciones(user2);
    }
}
