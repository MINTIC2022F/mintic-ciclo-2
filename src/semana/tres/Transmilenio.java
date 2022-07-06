
package semana.tres;

public class Transmilenio extends Vehiculo{
    private String ruta;
    
    public Transmilenio(){
    }
    
    public boolean detenerseEstacion(String parada){
        if(parada=="Restrepo"){
            return true;
        }else{
            return false;
        }
    }
    
    public String getRuta(){
        return this.ruta;
    }
    
    public void setRuta(String ruta){
        this.ruta=ruta;
    }

    @Override
    public String toString() {
        return "Transmilenio{" + "ruta=" + ruta + '}';
    }

    @Override
    public void frenar(String ruta) {
        System.out.println("Frenando desde transmilenio");
    }
    
}
