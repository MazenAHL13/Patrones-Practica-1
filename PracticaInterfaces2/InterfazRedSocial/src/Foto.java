import java.io.Serializable;

public class Foto implements Interectauble {

    public String name;

    public Foto(String name) {
        this.name = name;
    }

    public void comentar(String comentario){
        System.out.println("foto" + name + comentario);
    }
    public void reaccionar(String tipoReaccion){
        System.out.println("foto" + name + tipoReaccion);
    }
    public void compartir(){
        System.out.println("foto" + name + "fue Compartido");
    }
}

