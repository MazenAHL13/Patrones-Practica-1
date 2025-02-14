import java.util.ArrayList;
import java.util.List;

public class UsuarioRegular implements Recomendable {
    private String nombre;
    private List<Producto> recomendaciones;

    public UsuarioRegular(String nombre) {
        this.nombre = nombre;
        this.recomendaciones = new ArrayList<>();
    }

    @Override
    public void agregarRecomendacion(Producto producto) {
        if (producto.getPrecio() <= 20) {
            recomendaciones.add(producto);
        }
    }

    @Override
    public List<Producto> obtenerRecomendaciones() {
        return recomendaciones;
    }

    public String getNombre() {
        return nombre;
    }
}
