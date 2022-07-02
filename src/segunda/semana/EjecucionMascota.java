/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segunda.semana;

/**
 *
 * @author cdani
 */
public class EjecucionMascota {

    public static void main(String[] args) {
        Mascota mascota = new Mascota("femenino", 15.14);
        //mascota.tamano=3;
        System.out.println("mascota tamaño -> " + mascota.getTamano());
        mascota.comer("Vegetales");
        mascota.setRaza("Pastot Aleman");
        System.out.println("mascota.getRaza =>"+mascota.getRaza());
    }

}
