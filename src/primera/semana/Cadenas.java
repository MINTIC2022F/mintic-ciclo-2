package primera.semana;

public class Cadenas {

    public static void main(String[] args) {
        String miPrimerString = "";
        miPrimerString = "hola Daniel";
        String miPrimerString2 = "hola";
        //System.out.println(miPrimerString);

        //boolean resultado= miPrimerString.equals(miPrimerString2);
        boolean resultado = miPrimerString.equalsIgnoreCase(miPrimerString2);

        System.out.println(resultado);
        System.out.println(miPrimerString.contains(miPrimerString2));

        String nuevo = miPrimerString + " "+miPrimerString2;
        System.out.println(nuevo);
        
        System.out.println(miPrimerString2.length());

    }

}
