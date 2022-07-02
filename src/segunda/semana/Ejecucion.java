
package segunda.semana;

/**
 *
 * @author cdani
 */
public class Ejecucion {
    
    public static void main(String[] args) {
        //Carro miCarro=new Carro("Rojo", "mecanico", "deportivo", 325.21, "2018");
        Carro miCarro=new Carro();
        Carro miCarro2=new Carro("Rojo", "mecanico", "deportivo", 325.21, 2018);
        miCarro.color="amarillo";
        miCarro.modelo=2022;
//        System.out.println("color= "+miCarro.color);
//        System.out.println("modelo= "+miCarro.modelo);
//        System.out.println("tipoAuto= "+miCarro.tipoAuto);
//        System.out.println("tipoMotor= "+miCarro.tipoMotor);
//        System.out.println("cilindraje= "+miCarro.cilindraje);
//        
//        System.out.println("miCarro.transportar() --> "+miCarro.transportar(3));
//        System.out.println("miCarro2 => "+miCarro2.tipoAuto);
//        System.out.println(miCarro.esMasViejo(miCarro2.modelo));
//        miCarro.acelerar();
   
            System.out.println("miCarro2.tipoAuto antes -> "+miCarro2.tipoAuto);
            miCarro2.modificarTipoAuto("Clásico");
            System.out.println("miCarro2.tipoAuto despues -> "+miCarro2.tipoAuto);
            System.out.println("miCarro.tipoAuto  -> "+miCarro.tipoAuto);

    }
    
}
