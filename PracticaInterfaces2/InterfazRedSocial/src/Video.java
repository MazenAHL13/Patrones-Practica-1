public class Video   implements Interectauble{
    public String name;
    public Video(String name){
        this.name = name;
    }
    public void comentar(String comentario){
        System.out.println("video" + name + comentario);
    }
    public void reaccionar(String tipoReaccion){
        System.out.println("video" + name + tipoReaccion);
    }
    public void compartir(){
        System.out.println("video" + name + " fue compartido") ;
    }
}