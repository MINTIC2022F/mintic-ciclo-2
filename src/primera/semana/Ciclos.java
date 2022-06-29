package primera.semana;

public class Ciclos {

    public static void main(String[] args) {
        int numeroPar = 12;
//        while (numeroPar <= 10) {
//            System.out.println("Par: " + numeroPar);
//            numeroPar += 2;
//
//        }
//        do{
//            System.out.println("par: "+numeroPar);
//        }while(numeroPar <= 10);

//        while(true){
//            System.out.println("Hola");
//            break;
//        }
//        int numero = 1;
//        while (numero <= 100) {
//            System.out.println(numero);
//            numero++;
//        }
//        
//    for(int i=-10;i>=-20;i--){
//        System.out.println(i);
//    }
        String[] frutas = new String[]{"Manzana", "uva", "Pera"};
        //System.out.println(frutas[3]);

//        for(String elemento:frutas){
//            System.out.println(elemento);
//        }
        for (int i = 0; i <= frutas.length - 1; i++) {
            System.out.println("elemento: " + frutas[i]);
        }

    }

}
