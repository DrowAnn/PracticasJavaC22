package co.com.ps;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjercicioEnClase5 {

    public void palabrasMasCinco() {

        //Metodo tradicional
        List<String> listaPalabras = Arrays.asList("Java", "Stream", "Ejemplo", "Programacion", "Funcional");
        List<String> listaFiltrada = new ArrayList<>();

        for (String palabra : listaPalabras) {
            if (palabra.length() > 5) {
                listaFiltrada.add(palabra);
            }
        }

        System.out.println("(Tradicional) Las palabras con más de 5 letras en el arreglo son:");
        listaFiltrada.stream().forEach(System.out::println);
        System.out.println(" ");

        //Programacion Funcional
        System.out.println("(Funcional) Las palabras con más de 5 letras en el arreglo son:");
        listaPalabras.stream().filter(palabra -> palabra.length() > 5).forEach(System.out::println);

    }

}