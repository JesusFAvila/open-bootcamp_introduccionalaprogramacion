public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 30;
        cliente.nombre = "Jhon Wick";
        cliente.telefono = 111101010;
        cliente.credito = 350;
        System.out.println("El cliente tiene "+ cliente.edad +" años, se llama "+ cliente.nombre + ", su número de teléfono es: +34"+ cliente.telefono + ", y tiene "+cliente.credito+" créditos.");

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 45;
        trabajador.nombre = "Bilbo";
        trabajador.telefono = 01001010 ;
        trabajador.salario = 1600;
        System.out.println("El trabajador tiene "+ trabajador.edad +" años, se llama "+ trabajador.nombre + ", su número de teléfono es: +34"+ trabajador.telefono + ", y cobra "+trabajador.salario+" € al mes.");

    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;
}
class Cliente extends Persona{
    int credito;
}
class Trabajador extends Persona{
    int salario;
}

