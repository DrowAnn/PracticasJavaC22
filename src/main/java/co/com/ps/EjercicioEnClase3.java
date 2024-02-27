package co.com.ps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EjercicioEnClase3 {

    public void nombresArray() {

        String nombresEstudiantes[] = new String[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < nombresEstudiantes.length; i++) {

            System.out.println("Digite el nombre del estudiante numero " + (i + 1) + ": ");
            nombresEstudiantes[i] = scanner.next();

        }

        System.out.println(" ");
        System.out.println("Los nombres almacenados en el arreglo fueron:");
        Arrays.stream(nombresEstudiantes).forEach(System.out::println);
        System.out.println(" ");

    }

    public void nombresList() {

        List<String> nombresEstudiantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.println("Digite el nombre del estudiante numero " + (i + 1) + ": ");
            nombresEstudiantes.add(scanner.next());

        }

        System.out.println(" ");
        System.out.println("Los nombres almacenados en el arreglo fueron:");
        nombresEstudiantes.stream().forEach(System.out::println);
        System.out.println(" ");

    }

}