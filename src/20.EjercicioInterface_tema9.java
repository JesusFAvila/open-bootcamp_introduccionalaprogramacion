public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

//INTERFACE: Nos dice los metodos que hay que poner en una clase que la interface define

interface Vehiculo{
     void acelerar(int velocidad);
     void frenar(int velocidad);
}

class Coche implements Vehiculo{
    public void acelerar (int velocidad){

    }
    public void frenar (int velocidad){

    }
}

class Moto{

}
