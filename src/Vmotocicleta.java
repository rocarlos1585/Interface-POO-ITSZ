/**
 * Created by robert on 3/05/16.
 */
public class Vmotocicleta extends SCvehiculos implements movimiento, caracteristicas{

    public int numAsientos;

    public int getAsientos(){return numAsientos;}

    public void setAsientos(int numAsientos){this.numAsientos = numAsientos;}

    public void que_es() {
        System.out.println("soy una motocileta");
    }

    public void avanzar() {
        System.out.println("estoy arrancando");
    }


}
