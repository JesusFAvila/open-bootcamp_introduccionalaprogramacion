public class Main {
        public static void main(String[] args) {
            //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0
            int numeroIf  = -12;
            if (numeroIf  > 0){
                System.out.println("El número es positivo");
            } else if (numeroIf  < 0) {
                System.out.println("El número es negativo");
            }else{
                System.out.println("El número es 0");
            }

            //Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
            int numeroWhile = -2;
            while (numeroWhile <= 3){
                numeroWhile = numeroWhile +1;
                System.out.println("El numeroWhile "+ numeroWhile +" es inferior a 3 y se ha incrementado hasta 3");
            }

            //Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
            int numeroDowhile = 0;
            do{
                numeroDowhile = numeroDowhile +1;
                System.out.println("El numeroDowhile "+ numeroDowhile +" es inferior a 3 y se ha incrementado hasta 3");
            }while (numeroWhile <= 3);

            //Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
            for (int numeroFor = 0 ; numeroFor <= 3 ; numeroFor = numeroFor +1){
                System.out.println("El numeroFor "+ numeroFor +" es inferior a 3 y se ha incrementado hasta 3");
            }
            
            //Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
            var estacion = "septiembre";
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
                default:
                    System.out.println("La estación "+ estacion + " no es una estación válida");

            }
        }
}
