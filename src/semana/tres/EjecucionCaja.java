/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana.tres;

/**
 *
 * @author cdani
 */
public class EjecucionCaja {

//    public static void main(String[] args) {
//            Caja caja = new Caja();
//            String s = caja.decorar(10);
//            String s2 = caja.decorar(14.56);
//            String s3 = caja.decorar("Hola");
//            System.out.println(s);
//        Caja caja = new Caja("Hola mundo");
//        System.out.println(caja.decorar());
//        System.out.println(caja.obtener());
//                
//
//    }
    public static void main(String[] args) {
        
        Caja<String> caja = new Caja<>("Pedro Páramo");
        System.out.println(caja.decorar());
        char c = caja.obtener().charAt(2);
        System.out.println(c);
        Caja<Double> caja2 = new Caja<>(20.34);
        System.out.println(caja2.decorar());
        double y = caja2.obtener() + 20.0;
        System.out.println(y);

    }

}
