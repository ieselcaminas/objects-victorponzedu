package socialnetwork;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Mensaje t = new Mensaje("Juan", 1, "Primer mensaje");
        System.out.println(t);

        Fotografia f = new Fotografia("María", "Amanecer", "c:/amanecer.png");

        f.darLike();
        System.out.println(f);

    }
}
