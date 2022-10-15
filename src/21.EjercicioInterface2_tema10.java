public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        Moto moto = new Moto();
        ejecutaAcelerar(coche);
        ejecutaAcelerar(moto);
    }
    public static void ejecutaAcelerar (Vehiculo vehiculo){ //Creamos funcion para implementar una clase con la funcion acelerar
        vehiculo.acelerar(30);
    }
}

//INTERFACE: Nos dice los metodos que hay que poner en una clase que la interface define

interface Vehiculo{
    void acelerar(int velocidad);
    void frenar(int velocidad);
}
class Moto implements Vehiculo{
    public void acelerar (int velocidad){
        System.out.println(velocidad);

    }
    public void frenar (int velocidad){

    }
}

class Coche implements Vehiculo{ //Clase coche implementa la interface Vehiculo
    public void acelerar (int velocidad){
        System.out.println(velocidad);

    }
    public void frenar (int velocidad){

    }
}

