import java.util.List;

public interface Recomendable {
    void agregarRecomendacion(Producto producto);
    List<Producto> obtenerRecomendaciones();

}

