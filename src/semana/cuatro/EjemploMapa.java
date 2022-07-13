package semana.cuatro;

import java.util.HashMap;

public class EjemploMapa {

    public static void main(String[] args) {

        HashMap<String, String> capitales = new HashMap<>();
        capitales.put("España", "Madrid");
        capitales.put("Francia", "París");
        capitales.put("Italia", "Roma");
        capitales.put("Rusia", "Moscú");

        System.out.println(capitales.entrySet());
        System.out.println(capitales.keySet());

        System.out.println(capitales.values());
        System.out.println(capitales.size());
        System.out.println(capitales.get("Rusia"));
        System.out.println(capitales.containsKey("Colombia"));
        System.out.println(capitales.containsValue("Moscú"));
        System.out.println(capitales.remove("Francia"));
        System.out.println(capitales.remove("España", "Madrid"));

        System.out.println(capitales.entrySet());
    }
}
