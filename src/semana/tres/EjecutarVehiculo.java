package semana.tres;

public class EjecutarVehiculo {

    public static void main(String[] args) {
        Motocicleta moto = new Motocicleta();
        moto.setMotor("4 val");
        moto.setRuedas(2);
        moto.setTipoMotor("2 tiempos");

//        System.out.println("motor=" + moto.getMotor());
//        System.out.println("ruedas=" + moto.getRuedas());
//        System.out.println("tipoMotor=" + moto.getTipoMotor());
        
        
        Transmilenio transmi = new Transmilenio();
//        transmi.setMotor("8 val");
//        transmi.setRuedas(12);
        transmi.setRuta("Bogota");
        
//        System.out.println("motor=" + transmi.getMotor());
//        System.out.println("ruedas=" + transmi.getRuedas());

        //System.out.println(transmi.detenerseEstacion("Restrepo"));
        
        transmi.frenar("Estacion");
        moto.frenar("Casa");
        saludar();
        System.out.println(Motocicleta.obtenerContaminacion());
    }

    public static void saludar(){
        System.out.println("Hola....");
    }
    
}
