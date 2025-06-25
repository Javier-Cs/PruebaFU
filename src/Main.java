import Ejemplo2.Operaciones;
import Ejemplo2.Opercion;
import Model.CompararNombreLong;
import Model.FakerUtils;
import Model.Persona;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Operaciones suma = (a, b) -> a + b;
        Operaciones multi = (a, b) -> a * b;
        Operaciones divide = (a, b) -> a / b;
        Operaciones subtract = (a, b) -> a - b;

        System.out.println(suma.apply(1, 2));
        System.out.println(multi.apply(1, 2));
        System.out.println(divide.apply(1, 2));
        System.out.println(subtract.apply(1, 2));

//        Opercion op =  new Opercion();
//        System.out.println(op.suma(1,1));
//        System.out.println(op.resta(1,1));
//        System.out.println(op.multiplicacion(1,1));
//        System.out.println(op.division(4,2));
    }

    public static double opera(double a, double b, Operaciones op) {
        return op.apply(a, b);

    }
}


//
//
//
//
//
////        List<Persona> personas = generarPersonas(100);
////        System.out.println(personas);
////        //la implementación de una clase anonima se la representa como una instancia
////        personas.sort((o1, o2) -> Integer.compare(o1.getNombre().length(), o2.getNombre().length()));
////        System.out.println(personas);
//    }
//
////    private static List<Persona> generarPersonas(int i) {
////        List<Persona> personas = new ArrayList<>();
////
////        for (int j = 0; j < i; j++) {
////            String nombre = FakerUtils.generarNombre();
////            String apellido = FakerUtils.generarApellido();
////            personas.add(new  Persona(nombre, apellido));
////        }
////
////
////        return personas;
////    }
//}