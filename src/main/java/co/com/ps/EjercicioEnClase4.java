package co.com.ps;

import java.util.Scanner;

public class EjercicioEnClase4 {

    public EjercicioEnClase4(){

    }

    public void estadoNumero(){

        Scanner scanner = new Scanner(System.in);
        Integer num;

        System.out.println("Digite un numero para saber si es Positivo, Negativo o Cero:");
        num = scanner.nextInt();

        if(num == 0){
            System.out.println("El numero es 0");
        }else if(num > 0){
            System.out.println("El numero " + num + " es positivo");
        }else{
            System.out.println("El numero " + num + " es negativo");
        };

        System.out.println(" ");

    }

    public void descuentoTienda(){

        Scanner scanner = new Scanner(System.in);
        Integer precioProducto, tipoProducto;
        Double valorFinal = 0.0, valorDescuento = 0.0;

        System.out.println("Digite el numero de la opcion de acuerdo con el tipo de producto:");
        System.out.println("1. Electrodomestico");
        System.out.println("2. Ropa");
        System.out.println("3. Alimentos");
        tipoProducto = scanner.nextInt();

        System.out.println("Digite el precio del producto:");
        precioProducto = scanner.nextInt();

        if(tipoProducto == 1){
            valorFinal = precioProducto * 0.9;
            valorDescuento = precioProducto * 0.1;
        } else if (tipoProducto == 2) {
            valorFinal = precioProducto * 0.95;
            valorDescuento = precioProducto * 0.05;
        } else if (tipoProducto == 3) {
            valorFinal = precioProducto * 0.98;
            valorDescuento = precioProducto * 0.02;
        }else {
            System.out.println("Tipo de producto no valido");
        }

        System.out.println("El valor del descuento es: " + valorDescuento);
        System.out.println("El valor a pagar con descuento es: " + valorFinal);

    }

}