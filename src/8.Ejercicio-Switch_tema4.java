public class Main {
    public static void main(String[] args) {
        var estacion = "primavera";
        switch (estacion){
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
        }
        var dia = "domingo";
        switch (dia){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es laborable");
                break;
            case "sabado":
            case "domingo":
                System.out.println("Es festivo");
                break;
        }
    }
}
