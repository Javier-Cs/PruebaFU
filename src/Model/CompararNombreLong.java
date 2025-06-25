package Model;

import java.util.Comparator;

public class CompararNombreLong implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        int primero =o1.getNombre().length();
        int segundo =o2.getNombre().length();

        return Integer.compare(primero,segundo);

//        if(primero>segundo){
//            return 1;
//        }else  if(primero<segundo){
//            return -1;
//        }
//        return 0;
    }
}
