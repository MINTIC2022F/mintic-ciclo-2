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
public class Caja<T> {

    protected T obj;

    public Caja(T obj) {
        this.obj = obj;
    }

    public T obtener() {
        return obj;
    }

    public String decorar() {
        String s = obj.toString();
        String linea = "*";
        for (int i = 0; i < s.length(); i++) {
            linea += "*";
        }
        linea += "*";
        return linea + "\n*" + s + "*\n" + linea;
    }
}
//public class Caja {

//    public String decorar(int n) {
//        String s = "" + n;
//        String linea = "*";
//        for (int i = 0; i < s.length(); i++) {
//            linea += "*";
//        }
//        linea += "*";
//        return linea + "\n*" + s + "*\n" + linea;
//    }
//
//    public String decorar(double x) {
//        String s = "" + x;
//        String linea = "*";
//        for (int i = 0; i < s.length(); i++) {
//            linea += "*";
//        }
//        linea += "*";
//        return linea + "\n*" + s + "*\n" + linea;
//    }
//
//    public String decorar(String s) {
//        String linea = "*";
//        for (int i = 0; i < s.length(); i++) {
//            linea += "*";
//        }
//        linea += "*";
//        return linea + "\n*" + s + "*\n" + linea;
//    }
//    public String decorar(Object obj) {
//        String s = obj.toString();
//        String linea = "*";
//        for (int i = 0; i < s.length(); i++) {
//            linea += "*";
//        }
//        linea += "*";
//        return linea + "\n*" + s + "*\n" + linea;
//    }
//    protected Object obj;
//
//    public Caja(Object obj) {
//        this.obj = obj;
//    }
//
//    public Object obtener() {
//        return obj;
//    }
//
//    public String decorar() {
//        String s = obj.toString();
//        String linea = "*";
//        for (int i = 0; i < s.length(); i++) {
//            linea += "*";
//        }
//        linea += "*";
//        return linea + "\n*" + s + "*\n" + linea;
//    }

//}
