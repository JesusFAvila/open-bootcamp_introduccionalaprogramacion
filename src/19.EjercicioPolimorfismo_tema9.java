public class Main {
    public static void main(String[] args) {
        Gorki gorki = new Gorki();
        gorki.saluda();
        System.out.println(gorki.sumaNumeros((float)3, (float)12));

    }
}
//POLIMORFISMO: UNA CLASE DETIVADA IMPLEMENTA LA MISMA FUNCION QUE LA PADRE PERO HACE ALGO DISTINTO
class Perro{
    public void saluda(){
        System.out.println("Ladra");
    }
}
class Gorki extends Perro{
    public void saluda(){ //Polimorfismo: Modifica la funcion saluda() de la clase padre.
        System.out.println("Hola humano.");
    }

    public int sumaNumeros(int a, int b){
        System.out.println("SUMANUMEROS INT");
        return a + b;
    }
    public float sumaNumeros(float a, float b){
        System.out.println("SUMANUMEROS FLOAT");
        return a + b * (float) 9.0;
    }
    public void sumaNumeros(double a , double b){
        System.out.println("SUMANUMEROS DOUBLE");
        System.out.println("El resultado es"  + (a + b));
    }
}

