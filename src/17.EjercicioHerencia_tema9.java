public class Main {
    public static void main(String[] args) {
        Moto moto = new Moto();
        System.out.println("DATOS MOTO");
        moto.velocidadMaxima = 250;
        moto.velocidadMinima= 60;
        moto.tipoGasolina= "Gasolina";
        moto.matricula= "ABC-1234-ES";
        moto.numeroRuedas=2;
        System.out.println(moto.compruebaMatricula("ABC-1234-ES"));
        moto.setSonido("El sonido de la moto es: BRBRBR");
        System.out.println(moto.getSonido());
        System.out.println("DATOS SCOOTER");
        ScooterElectrica scooter = new ScooterElectrica();
        scooter.setSonido("No hay sonido porque es eléctrica");
        System.out.println(scooter.getSonido());
    }
}
//UTILIZAR CLASE PADRE E HIJA
//CLASE PADRE: Cuando tengo la certeza absoluta de que no voy a necesitar ningun metodo adicional al que esta en esta clase.

abstract class Vehiculo{
    int velocidadMaxima;
    int velocidadMinima;
    String tipoGasolina;
    String sonido;
    public boolean compruebaMatricula(String matricula){
        if (matricula == "ABC-1234-ES"){
            return true;
        }
        return false;
    }
    //CONSTRUCTOR
    public Vehiculo(){
        System.out.println("Constructor de vehiculo");
    }
    // Funcion sonido
}
 class Coche extends Vehiculo{ //Se crea la clase hija mediante extends vehiculo
    int numeroRuedas;
    String matricula;
     public String getSonido(){
         return this.sonido;
     }
     public void setSonido(String sonido){
         this.sonido=sonido;
     }
}
class ScooterElectrica extends Vehiculo{
    public String getSonido(){
        return this.sonido;
    }
    public void setSonido(String sonido){
        this.sonido=sonido;
    }
}
final class Moto extends Coche{} // HEREDA TODAS LAS PROPIEDADES DEL INMEDIATAMENTE ANTERIOR (PADRE), NO ABUELO
//FINAL CLASS IMPIDE QUE ESA CLASE PUEDA TENER HERENCIA
