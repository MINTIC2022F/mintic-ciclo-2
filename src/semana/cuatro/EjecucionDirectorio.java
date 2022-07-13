package semana.cuatro;

import java.util.HashMap;

public class EjecucionDirectorio {

    public static void main(String[] args) {

        Persona persona = new Persona(1022, "Daniel");
        HashMap<Integer, Persona> directorio=new HashMap<>();
        
        directorio.put(4644123, persona);
        System.out.println(directorio.entrySet());
        
    }
}
