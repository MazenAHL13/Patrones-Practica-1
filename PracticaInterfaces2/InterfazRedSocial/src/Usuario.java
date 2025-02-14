public class Usuario {
    public void interactuar(Interectauble publicacion, String comentario, String reaccion) {
        System.out.println(" El usuario está interactuando con la publicación.");
            publicacion.comentar(comentario);
            publicacion.compartir();
            publicacion.reaccionar(reaccion);

    }
}

