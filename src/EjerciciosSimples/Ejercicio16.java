package EjerciciosSimples;

import java.util.Scanner;

// 16. Introducir un número por teclado que nos diga si es positivo o negativo.
public class Ejercicio16 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número, positivo o negativo");
        int numero = scanner.nextInt();

        if(numero < 0){
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es positivo");
        }
    }
}

