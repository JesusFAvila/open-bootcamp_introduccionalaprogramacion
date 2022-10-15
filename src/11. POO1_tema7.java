public class Main {
    public static void main(String[] args) {
        //OBJETO 1
        Coche coche = new Coche(); //Instanciamos la clase Coche creando la variable coche
        coche.acelerar();
        coche.frenar();
        System.out.println("La velocidad actual es de "+ coche.velocidadactual + "km/h");
        System.out.println("La velocidad punta es de "+ coche.velocidadpunta + "km/h");
        System.out.println("El coche tine "+ coche.numeropuertas + " puertas.");

        //OBJETO 2
        Coche2 coche2 = new Coche2();
        coche2.acelerar();
        coche2.frenar();
        System.out.println("La velocidad actual es de "+ coche2.velocidadactual + "km/h");
        System.out.println("La velocidad punta es de "+ coche2.velocidadpunta + "km/h");
        System.out.println("El coche tine "+ coche2.numeropuertas + " puertas.");

    }
}
//Creación de Objetos:
//1. Creamos la clase Coche con sus propiedades y funciones
//2. Instanciamos la clase Coche
class Coche{
    int numeropuertas = 5;
    int velocidadpunta = 120;
    int velocidadactual;
    public void acelerar(){
        velocidadactual += 15;
    }; //estas funciones (dentro de una clase) se denominan métodos.
    public void frenar(){
        velocidadactual -= 5;
    };

}

class Coche2{
    int numeropuertas = 3;
    int velocidadpunta = 250;
    int velocidadactual;
    public void acelerar(){
        velocidadactual += 100;
    }; //estas funciones (dentro de una clase) se denominan métodos.
    public void frenar(){
        velocidadactual -= 60;
    };

}
