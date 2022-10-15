public class Main {
    public static void main(String[] args) {
        //OBJETO 1
        Coche coche = new Coche(5,90,10);
        System.out.println("La velocidad actual es de "+ coche.velocidadactual + "km/h");
        System.out.println("La velocidad punta es de "+ coche.velocidadpunta + "km/h");
        System.out.println("El coche tiene "+ coche.numeropuertas + " puertas.");

        Coche coche2 = new Coche();
        System.out.println("La velocidad actual es de "+ coche2.velocidadactual + "km/h");
        System.out.println("La velocidad punta es de "+ coche2.velocidadpunta + "km/h");
        System.out.println("El coche tiene "+ coche2.numeropuertas + " puertas.");

    }
}
class Coche{

    int numeropuertas;
    float velocidadpunta;
    float velocidadactual;

    public Coche(){
        numeropuertas = 3;
        velocidadpunta = 500;
        velocidadactual=120;
        System.out.println("EJECUCIÓN DEL CONSTRUCTOR SIN PARAMETROS");
    }
    public Coche( int numeropuertas, int velocidadpunta, float velocidadactual){
        this.numeropuertas = numeropuertas;// Añadimos THIS para indicar que hacemos referencia a la variable de la clase
        this.velocidadpunta = velocidadpunta;
        this.velocidadactual=velocidadactual;
        System.out.println("EJECUCIÓN DEL CONSTRUCTOR CON PARAMETROS");
    }

}

