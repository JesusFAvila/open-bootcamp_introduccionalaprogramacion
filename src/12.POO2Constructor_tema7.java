public class Main {
    public static void main(String[] args) {
        //OBJETO 1
        Coche coche = new Coche(); //Instanciamos la clase Coche creando la variable coche
        coche.acelerar();
        coche.frenar();
        System.out.println("La velocidad actual es de "+ coche.velocidadactual + "km/h");
        System.out.println("La velocidad punta es de "+ coche.velocidadpunta + "km/h");
        System.out.println("El coche tiene "+ coche.numeropuertas + " puertas.");

    }
}
//Creación de Objetos:
//1. Creamos la clase Coche con sus propiedades y funciones
//2. Instanciamos la clase Coche
class Coche{

    int numeropuertas;
    int velocidadpunta;
    int velocidadactual;

    public Coche(){ //CONSTRUCTOR
     numeropuertas = 5;
     velocidadpunta = 220;
     System.out.println("EJECUCIÓN DEL CONSTRUCTOR");
    }
    public void acelerar(){
        velocidadactual += 15;
    }; //estas funciones (dentro de una clase) se denominan métodos.
    public void frenar(){
        velocidadactual -= 5;
    };

}

