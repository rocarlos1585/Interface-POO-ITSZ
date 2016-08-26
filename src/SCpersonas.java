/**
 * Created by robert on 3/05/16.
 */
public class SCpersonas {

    String nombre;
    int edad;
    String Nacionalidad;
    String tipoSangre;

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){

        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){

        this.edad = edad;
    }

    public String getNacionalidad(){return Nacionalidad;}

    public void setNacionalidad(String Nacionalidad){this.Nacionalidad=Nacionalidad;}

    public String getTipoSangre(){return tipoSangre;}

    public void setTipoSangre(String tipoSangre){this.tipoSangre=tipoSangre;}
}
