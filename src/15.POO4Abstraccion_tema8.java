
public class Main {
    public static void main(String[] args) {

    }
}
abstract class Vehiculo{
    private String tipo; //Acceso privado, no se puede accerder directamente desde el objeto instanciado.
    private float velocidadmedia;
    private boolean rapido; //En propiedades Bool el Set se invoca igual, pero el Getter se nombra como isNombrevariable
    private String sonido;
    abstract public void setSonido(String sonido);
    abstract public String getSonido();


}
