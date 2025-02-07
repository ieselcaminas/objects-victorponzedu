package facultad;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Facultad universidad = new Facultad(1, "UPV");
        List<AreaConocimiento> facultad = new ArrayList<>();
        AreaConocimiento ciencia = new AreaConocimiento(1, "Ciencias");
        Catedra catCiencias = new Catedra(1, "Cátedra Ciencias", universidad);
        universidad.addCatedra(catCiencias);
            Departamento inf = new Departamento(1, "Informática", ciencia, catCiencias);
                Profesor victor = new Profesor(1, "Víctor", inf);
                inf.addProfesor(victor);
                victor.addCatedra(catCiencias);
                catCiencias.addProfesor(victor);

                Profesor ruben = new Profesor(2, "Rubén", inf);
                inf.addProfesor(ruben);
                ruben.addCatedra(catCiencias);
                catCiencias.addProfesor(ruben);

            Departamento mat = new Departamento(2, "Matemáticas", ciencia, catCiencias);
                Profesor prof = new Profesor(3, "Juan", mat);
                mat.addProfesor(prof);

            ciencia.addDepartamento(inf);
            ciencia.addDepartamento(mat);


        Catedra catLetras = new Catedra(2, "Cátedra letras", universidad);
        universidad.addCatedra(catLetras);
        AreaConocimiento letras = new AreaConocimiento(2, "Letras");
            Departamento latin = new Departamento(3, "Latín", letras, catLetras);
            letras.addDepartamento(latin);

        facultad.add(ciencia);
        facultad.add(letras);
/*
        for (AreaConocimiento area:facultad){
            System.out.println(area.getNombre());
            for (Departamento dep: area.getDepartamentos()){
                System.out.println("\t" + dep.getNombre());
                for(Profesor profe : dep.getProfesores()){
                    System.out.println("\t\t" + profe.getNombre());
                    for(Catedra cat: profe.getCatedras()){
                        System.out.println("\t\t\t" + cat.getNombre());
                    }
                }
            }
        }
*/

        for (AreaConocimiento area:facultad){
            for (Departamento dep: area.getDepartamentos()){
                System.out.println("\t" + dep.getNombre());
                System.out.println("\t\t" + dep.getCatedra().getNombre());
                for (Profesor p: dep.getCatedra().getProfesores()){
                    System.out.println("\t\t\t" + p.getNombre());
                }
            }
        }

    }
}
