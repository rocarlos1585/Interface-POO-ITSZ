/**
 * Created by robert on 3/05/16.
 */
public class SCvehiculos {

    int numeroCilindros;
    int numeroPasajeros;
    String color;
    String modelo;
    String marca;
    String placas;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void encenderMotor(){
        System.out.println("Encendido del motor");
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getPlacas(){
        return placas;
    }

    public void setPlacas(String placas){
        this.placas = placas;
    }

    public int getCilindros(){
        return numeroCilindros;
    }

    public void setCilindros(int numeroCilindros){
        this.numeroCilindros = numeroCilindros;
    }

    public int getPasajeros(){
        return numeroPasajeros;
    }

    public void setPasajeros(int numeroPasajeros){
        this.numeroPasajeros = numeroPasajeros;

    }
}

