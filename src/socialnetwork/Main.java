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
        juan.addPubicacion(t);

        Usuario maria = new Usuario("maria", "María Pérez", 1);
        Fotografia f = new Fotografia(maria, "Amanecer", "c:/amanecer.png");
        publicaciones.add(f);
        maria.addPubicacion(f);
        Comentario c = new Comentario(1, juan, "Muy bueno", t);
        comentarios.add(c);
        f.addComentario(c);
        f.darLike();
        System.out.println();
        for(Publicacion publicacion: publicaciones){
            System.out.println(publicacion);
            for(Comentario comentario: publicacion.getComentarios()){
                System.out.println(comentario);
            }
        }

    }
    private static void publicacionesDe(String nombre, List<Publicacion> listaPubicaciones){
        listaPubicaciones.stream()
                .filter((p) -> p.getUsuario().getNombre().equals(nombre))
                .forEach(System.out::println);
    }
}
