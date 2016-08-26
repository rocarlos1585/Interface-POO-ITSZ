/**
 * Created by robert on 3/05/16.
 */
public class Vauto extends SCvehiculos implements movimiento, caracteristicas{

    public int numPuertas;

    public int getPuertas(){return numPuertas;}

    public void setPuertas(int numPuertas){this.numPuertas = numPuertas;}


    public void que_es() {
        System.out.println("soy un auto");

    }


    public void avanzar() {
        System.out.println("estoy acelerando");
    }





}
