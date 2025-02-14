import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("RedSocial.com");
        Usuario usuario = new Usuario();
        Interectauble foto = new Foto(" de Gatitos");
        Interectauble video = new Video(" de Gatitos");
        Interectauble articulo = new Articulo(" de Gatitos");


        usuario.interactuar(foto, " Bonitos Gatitos", "Me gusta");
        usuario.interactuar(video, " Bonitos Gatitos!", "Me encanta");
        usuario.interactuar(articulo, " Bonitos Gatitos!", "Me gusta");


        }
    }