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
        List<Persona> personas = generarPersonas(100);
        System.out.println(personas);
        //la implementación de una clase anonima se la representa como una instancia
        personas.sort((o1, o2) -> Integer.compare(o1.getNombre().length(), o2.getNombre().length()));
        System.out.println(personas);
    }

    private static List<Persona> generarPersonas(int i) {
        List<Persona> personas = new ArrayList<>();

        for (int j = 0; j < i; j++) {
            String nombre = FakerUtils.generarNombre();
            String apellido = FakerUtils.generarApellido();
            personas.add(new  Persona(nombre, apellido));
        }


        return personas;
    }
}