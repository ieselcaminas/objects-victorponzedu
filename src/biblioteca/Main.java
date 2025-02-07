package biblioteca;

public class Main {
    public static void main(String[] args) {
        /*
         * Debéis hacer las instancias nada más creáis una clase
         * Primero las que no dependan de ninguna, pero que, seguramente,
         * tendrán una lista de 1 o más clases.
         */
        Autor cerv = new Autor(1, "Cervantes");
        Tema nov = new Tema(1, "Novela");
        Editorial ed = new Editorial(1, "Plaza");
        /**
         *Como Libro depende de Editorial, he creado primero la Editorial
         */
        Libro quijote = new Libro(1, "Quijote", ed);

        //No nos olvidemos de añadir el libro a las listas de editorial y autor
        ed.addLibro(quijote);

        cerv.addLibro(quijote);

        //Y añadamos el autor al libro
        quijote.addAutor(cerv);
        //Y también el tema
        quijote.addTema(nov);

        //Lo mismo con los ejemplares
        Ejemplar ejQuijote = new Ejemplar(1, quijote);
        Ejemplar ejQuijote2 = new Ejemplar(2, quijote);

        //Ahora los añado a la lista de ejemplares del libro
        quijote.addEjemplar(ejQuijote);
        quijote.addEjemplar(ejQuijote2);

        //Ahora juan va a tomar prestado un ejemplar del quijote
        Lector juan = new Lector(1, "Juan");
        juan.addEjemplar(ejQuijote);

        //Juan devuelve el ejemplar y pasa al histórico. En una aplicación real
        //habría que hacer más cosas como borrarlo de la lista de ejemplares prestados
        Historico historico = new Historico(1, juan, ejQuijote, "hoy", "mañana");
    }
}
