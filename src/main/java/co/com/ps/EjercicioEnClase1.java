package co.com.ps;

import java.util.Scanner;

public class EjercicioEnClase1 {

    public static void main() {

        Scanner scanner = new Scanner(System.in);
        Integer num1, num2, num3;
        Double prom;
        String nombre;

        System.out.println("Digite su nombre:");
        nombre = scanner.next();

        System.out.println("Digite el primer numero:");
        num1 = scanner.nextInt();

        System.out.println("Digite el segundo numero:");
        num2 = scanner.nextInt();

        System.out.println("Digite el tercer numero:");
        num3 = scanner.nextInt();

        prom = (Double.valueOf(num1 + num2 + num3)) / 3;

        System.out.println(nombre + " el promedio de los numeros es: " + prom);

    }

}