public class Main {
    public static void main(String[] args) {
        double euros = 15900;
        int eurosInt;
                eurosInt=(int)euros; //forzamos la conversión de variable euros a int
        impresonraeuros(eurosInt);
    }

    public static void impresonraeuros(int valor){
        System.out.println("Tienes: "+ valor +"€");
    }
}
