public class Articulo implements Interectauble {
    public String name;

    public Articulo(String name) {
        this.name = name;
    }
    public void comentar(String comentario) {
        System.out.println("articulo" + name + comentario);
    }

    public void reaccionar(String tipoReaccion) {
        System.out.println("articulo" + name + tipoReaccion);
    }

    public void compartir() {
        System.out.println("articulo" + name + "fue compartido");
    }
}
