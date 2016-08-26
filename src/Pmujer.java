/**
 * Created by robert on 3/05/16.
 */
public class Pmujer extends SCpersonas implements movimiento, caracteristicas{


    public String cabello;

    public String getCabello(){return cabello;}

    public void setCabello(String cabello){this.cabello = cabello;}

    public void que_es(){

        System.out.println("soy una mujer");

    }


    public void avanzar() {
        System.out.println("estoy avanzando a pie");
    }


}
