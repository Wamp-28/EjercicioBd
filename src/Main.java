import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double numero1, numero2, suma, resta, multi, raiz1, raiz2, seno, coseno;

        System.out.println("INGRESE EL PRIMER VALOR");
        numero1 = teclado.nextDouble();

        System.out.println("INGRESE EL SEGUNDO VALOR");
        numero2 = teclado.nextDouble();

        suma = numero1 + numero2;

        resta = numero1 - numero2;

        multi = numero1 * numero2;

        raiz1 = Math.sqrt(numero1);
        raiz2 = Math.sqrt(numero2);

        seno = Math.sin(numero1);
        coseno = Math.cos(numero2);

        System.out.println("LA SUMA ES: " + suma);
        System.out.println("LA RESTA ES: " + resta);
        System.out.println("LA MULTIPLICACION ES: " + multi);
        System.out.println("LA RAIZ 1 ES: " + raiz1);
        System.out.println("LA RAIZ 2 ES: " + raiz2);

        System.out.println("EL SENO ES: " + seno);
        System.out.println("EL COSENO ES: " + coseno);







    }
}