import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by robert on 3/05/16.
 */
public class Minterface {


    static Scanner scan = new Scanner(System.in);

    static ArrayList<SCvehiculos> Vehiculos = new ArrayList<>();
    static ArrayList<SCpersonas>  Personas  = new ArrayList<>();

    public static void main(String [] args){
        menu();
    }

    public static void menu (){

        int opcion;

        do {
            System.out.println("elije una de las dos opciones para agregarle caracteristicas");
            System.out.println("1- vehiculos");
            System.out.println("2- personas");
            System.out.println("3- salir");
            opcion = Integer.parseInt(scan.nextLine());

            switch (opcion) {

                case 1:
                    vehiculos();
                    break;

                case 2:
                    personas();
                    break;

                case 3:
                    break;

            }
        }while(opcion!=3);
    }


    public static void vehiculos(){
        int opcionV;

        do {
            System.out.println("elije una opcion");
            System.out.println("1- motocicleta");
            System.out.println("2- automovil");
            System.out.println("3- listar vehiculos");
            System.out.println("4- regresar al menu anterior");
            opcionV = Integer.parseInt(scan.nextLine());

            switch (opcionV){

                case 1:
                    motocicleta();
                    break;

                case 2:
                    automovil();
                    break;

                case 3:
                    Lvehiculos();
                    break;

                case 4:
                    menu();
                    break;
            }

        }while(opcionV!=4);

    }

    public static void personas(){

        int opcionP;

        do {
            System.out.println("elije una opcion");
            System.out.println("1- hombre");
            System.out.println("2- mujer");
            System.out.println("3- listar personas");
            System.out.println("4- regresar al menu anterior");
            opcionP = Integer.parseInt(scan.nextLine());

            switch (opcionP) {

                case 1:
                    hombre();
                    break;
                case 2:
                    mujer();
                    break;
                case 3:
                    Lpersonas();
                    break;
                case 4:
                    menu();
                    break;

            }
        }while(opcionP!=4);
    }

    public static void automovil(){

        Vauto auto = new Vauto();

        System.out.println("Marca del automovil");
        auto.setMarca(scan.nextLine());

        System.out.println("modelo del automovil");
        auto.setModelo(scan.nextLine());

        System.out.println("color del automovil");
        auto.setColor(scan.nextLine());

        System.out.println("placas del automovil");
        auto.setPlacas(scan.nextLine());

        System.out.println("de cuantos cilindros es el automovil");
        auto.setCilindros(Integer.parseInt(scan.nextLine()));

        System.out.println("cuantos pasajeros soporta su automovil");
        auto.setPasajeros(Integer.parseInt(scan.nextLine()));

        System.out.println("cuantas puertas tiene su vehiculo");
        auto.setPuertas(Integer.parseInt(scan.nextLine()));

        Vehiculos.add(auto);


    }

    public static void motocicleta(){

        Vmotocicleta moto = new Vmotocicleta();

        System.out.println("marca de la motocicleta: ");
        moto.setMarca(scan.nextLine());

        System.out.println("modelo de la motocicleta: ");
        moto.setModelo(scan.nextLine());

        System.out.println("color de la motocicleta: ");
        moto.setColor(scan.nextLine());

        System.out.println("placas de la motocicleta: ");
        moto.setPlacas(scan.nextLine());

        System.out.println("de cuantos cilindros es su motocicleta: ");
        moto.setCilindros(Integer.parseInt(scan.nextLine()));

        System.out.println("cuantos pasajeros soporta su motocicleta: ");
        moto.setPasajeros(Integer.parseInt(scan.nextLine()));

        System.out.println("con cuantos asientos cuenta su motocicleta");
        moto.setAsientos(Integer.parseInt(scan.nextLine()));

        Vehiculos.add(moto);
    }

    public static void Lvehiculos(){

        for (SCvehiculos OBvehiculo : Vehiculos) {

            if (OBvehiculo instanceof Vauto){

                ((Vauto) OBvehiculo).que_es();
                System.out.println("de la marca "+OBvehiculo.getMarca());
                System.out.println("modelo "+OBvehiculo.getModelo());
                System.out.println("color "+OBvehiculo.getColor());
                System.out.println("con placas "+OBvehiculo.getPlacas());
                System.out.println("cuento con "+OBvehiculo.getCilindros()+" cilindros");
                System.out.println("soporto hasta "+OBvehiculo.getPasajeros()+" pasajeros");
                System.out.println("tengo "+((Vauto) OBvehiculo).getPuertas()+" puertas");
                ((Vauto) OBvehiculo).avanzar();
            }

            if (OBvehiculo instanceof Vmotocicleta){

                ((Vmotocicleta) OBvehiculo).que_es();
                System.out.println("mi marca es "+OBvehiculo.getMarca());
                System.out.println("de modelo "+OBvehiculo.getModelo());
                System.out.println("color "+OBvehiculo.getColor());
                System.out.println("con placas "+OBvehiculo.getPlacas());
                System.out.println("tengo "+OBvehiculo.getCilindros()+" cilindros");
                System.out.println("soporto hasta "+OBvehiculo.getPasajeros()+" pasajeros");
                System.out.println("cuento con "+((Vmotocicleta) OBvehiculo).getAsientos()+" asientos");
                ((Vmotocicleta) OBvehiculo).avanzar();
            }
            System.out.println("<><><><><><><><><><><><><><><><>");
        }

    }

    public static void hombre(){

        Phombre hombre = new Phombre();

        System.out.println("nombre: ");
        hombre.setNombre(scan.nextLine());

        System.out.println("edad: ");
        hombre.setEdad(Integer.parseInt(scan.nextLine()));

        System.out.println("nacionalidad: ");
        hombre.setNacionalidad(scan.nextLine());

        System.out.println("tipo de sangre: ");
        hombre.setTipoSangre(scan.nextLine());

        System.out.println("como tiene usted su barba: ");
        hombre.setBarba(scan.nextLine());

        Personas.add(hombre);
    }

    public static void mujer(){

        Pmujer mujer = new Pmujer();

        System.out.println("nombre: ");
        mujer.setNombre(scan.nextLine());

        System.out.println("edad: ");
        mujer.setEdad(Integer.parseInt(scan.nextLine()));

        System.out.println("nacionalidad: ");
        mujer.setNacionalidad(scan.nextLine());

        System.out.println("tipo de sangre: ");
        mujer.setTipoSangre(scan.nextLine());

        System.out.println("como tiene su cabello: ");
        mujer.setCabello(scan.nextLine());

        Personas.add(mujer);

    }

    public static void Lpersonas(){

        for(SCpersonas OBpersonas: Personas){
            if(OBpersonas instanceof Phombre){

                ((Phombre) OBpersonas).que_es();
                System.out.println("mi nombre es "+OBpersonas.getNombre());
                System.out.println("tengo "+OBpersonas.getEdad()+" años");
                System.out.println("soy "+OBpersonas.getNacionalidad());
                System.out.println("mi tipo de sangre es "+OBpersonas.getTipoSangre());
                System.out.println("tengo mi barba "+((Phombre) OBpersonas).getBarba());
                ((Phombre) OBpersonas).avanzar();

            }

            if(OBpersonas instanceof Pmujer){

                ((Pmujer) OBpersonas).que_es();
                System.out.println("me llamo "+OBpersonas.getNombre());
                System.out.println("tengo "+OBpersonas.getEdad()+" años");
                System.out.println("soy "+OBpersonas.getNacionalidad());
                System.out.println("mi tipo de sangre es "+OBpersonas.getTipoSangre());
                System.out.println("tengo el cabello "+((Pmujer) OBpersonas).getCabello());
                ((Pmujer) OBpersonas).avanzar();
            }
            System.out.println("<><><><><><><><><><><><><><><>");
        }


    }
}
