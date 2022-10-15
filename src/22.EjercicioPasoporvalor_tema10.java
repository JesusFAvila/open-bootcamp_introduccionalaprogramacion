public class Main {

    //PASO POR VALOR
    public static void main(String[] args) {
        int valA = 11;// int = 32 bits = 4 bytes
        int valB = 22;// int = 32 bits = 4 bytes

        suma(valA, valB);
        System.out.println(valA);
        System.out.println(valB);
    }
    public static int suma(int a, int b){
        return a + b;
    }

    //PASO POR REFERENCIA: Cuando el parametro de una funcion es un objeto es paso por referencia
}
