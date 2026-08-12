package EjerciciosSimples;

import java.util.Scanner;

// 17. Introducir un número por teclado. Que nos diga si es par o impar.
public class Ejercicio17 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = scanner.nextInt();

        if(numero%2 == 0){
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}

