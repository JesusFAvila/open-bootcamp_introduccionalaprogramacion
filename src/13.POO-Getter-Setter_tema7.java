public class Main {
    public static void main(String[] args) {
    //  Las propiedades de una clase pueden ser Publicas, privadas o protegida
        Vehiculo coche = new Vehiculo();
        Vehiculo moto = new Vehiculo();
        coche.setTipo("Mercedes Benz"); //   Utilizamos la funcion SETTER para utilizar la propiedad privada
        moto.setTipo("Kawasaki Ninja");
        moto.setVelocidadmedia(150);
        coche.setVelocidadmedia(30);


        // vehiculo.tipo="Coche";
        //Utilizamos Getter para imprimir el resultado
        //System.out.println(vehiculo.tipo);
        System.out.println(coche.getTipo());
        System.out.println(moto.getTipo());
        System.out.println(moto.getVelocidadmedia());
        System.out.println(coche.getVelocidadmedia());
        System.out.println(coche.getVelocidadmedia()+  "/" + moto.getVelocidadmedia());



    }
}
class Vehiculo{
    private String tipo; //Acceso privado, no se puede accerder directamente desde el objeto instanciado.
    private float velocidadmedia;

    public void setTipo(String valor){ //Funcion Setter para utilizar propiedades privadas en funciones. Empiezan por SET continuando con el nombre d ela variable en mayuscula
        this.tipo = valor;
    }

    public void setVelocidadmedia(float valor){
        this.velocidadmedia = valor;
    }

    //Los Getter a diferencia del Setter no fija el valor, lo devuelve.
    public String getTipo(){
        return this.tipo;
    }

    public float getVelocidadmedia(){
        return this.velocidadmedia;
    }
}
