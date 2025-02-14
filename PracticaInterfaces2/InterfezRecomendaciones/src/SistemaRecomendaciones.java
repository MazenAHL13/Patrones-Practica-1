import java.util.List;

public class SistemaRecomendaciones {
    public void generarRecomendaciones(Recomendable usuario, List<Producto> productos) {
        for (Producto p : productos) {
            usuario.agregarRecomendacion(p);
        }
    }

    public void mostrarRecomendaciones(Recomendable usuario) {
        System.out.println("Recomendaciones para " + (usuario instanceof UsuarioPremium ? "Usuario Premium" : "Usuario Regular") + ":");

        List<Producto> recomendaciones = usuario.obtenerRecomendaciones();

        if (recomendaciones.isEmpty()) {
            System.out.println("- No hay productos recomendados.");
        } else {
            for (Producto p : recomendaciones) {
                System.out.println("- " + p);
            }
        }
    }
}

