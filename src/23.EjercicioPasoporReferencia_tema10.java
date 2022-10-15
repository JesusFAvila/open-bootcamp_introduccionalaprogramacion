public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        cocheAcelerar(coche); //Paso por referencia de objeto
        System.out.println("La velocidad del coche es de "+ coche.velocidad +" KM/H");
    }

    public static void cocheAcelerar(Coche coche){ //paso como parametro un objeto en la funcion
        coche.velocidad += coche.velocidad + 50;
    }
}

class Coche{
    int velocidad = 0;
}
