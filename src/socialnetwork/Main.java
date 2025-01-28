package socialnetwork;

import socialnetwork.Publicacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Publicacion> publicaciones = new ArrayList<>();
        List<Comentario> comentarios = new ArrayList<>();

        Usuario juan = new Usuario("juan", "Juan Pérez", 1);
        Mensaje t = new Mensaje(juan, 1, "Primer mensaje");
        publicaciones.add(t);
        //System.out.println(t);

        Usuario maria = new Usuario("maria", "María Pérez", 1);
        Fotografia f = new Fotografia(maria, "Amanecer", "c:/amanecer.png");
        publicaciones.add(f);
        Comentario c = new Comentario(1, juan, "Muy bueno", t);
        comentarios.add(c);

        for(Comentario comentario: comentarios){
            System.out.println(comentario.getPublicacion().getUsuario().getNick());
        }

        f.darLike();
        //System.out.println(f);



        //System.out.println(f.getUsuario().getNick());

    }
    private static void publicacionesDe(String nombre, List<Publicacion> listaPubicaciones){
        listaPubicaciones.stream()
                .filter((p) -> p.getUsuario().getNombre().equals(nombre))
                .forEach(System.out::println);
    }
}
