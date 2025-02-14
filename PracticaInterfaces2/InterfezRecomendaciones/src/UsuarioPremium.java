import java.util.ArrayList;
import java.util.List;

public class UsuarioPremium implements Recomendable {
    private String nombre;
    private List<Producto> recomendaciones;

    public UsuarioPremium(String nombre) {
        this.nombre = nombre;
        this.recomendaciones = new ArrayList<>();
    }

    @Override
    public void agregarRecomendacion(Producto producto) {
        if (producto.getPrecio() > 50) {
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
