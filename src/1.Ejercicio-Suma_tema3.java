
public class Main {
    public static void main(String[] args) {
        suma(102,100,8);
        Coche micoche = new Coche();
        micoche. sumarpuertas();
        micoche. sumarpuertas();
        System.out.println("El número de puertas es: " + micoche.numerodepuertas);
    }

    //Crear una función con tres parámetros que sean números que se suman entre sí.
    public static void suma(int a, int b, int c){
        int resultado= a + b + c;
        System.out.println(resultado);
    }
}

class Coche{
    public int numerodepuertas = 2;
    //Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

    public void sumarpuertas(){
        this.numerodepuertas++;
        //Una función que incremente el número de puertas que tiene el coche.

    }
}
