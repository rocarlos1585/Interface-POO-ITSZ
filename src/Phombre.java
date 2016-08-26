/**
 * Created by robert on 3/05/16.
 */
public class Phombre extends SCpersonas implements movimiento, caracteristicas{


    public String barba;

    public String getBarba (){return barba;}

    public void setBarba(String barba){this.barba = barba;}

    public void que_es() {
        System.out.println("soy un vato");
    }


    public void avanzar() {
        System.out.println("estoy avanzando corriendo");
    }



}
