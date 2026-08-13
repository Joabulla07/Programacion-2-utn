package EjerciciosSimples;

import java.util.Scanner;

// 29. Introducir dos números por teclado de tal forma que el segundo sea mayor que el primero.
// A partir del primero Imprimir los números separados Entre si 7 unidades, contarlos.
// Cuántos de estos son pares y cuanto vale la suma de los impares.
public class Ejercicio29 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int pares = 0;
        int impares = 0;

        System.out.println("Ingrese un número");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese un numero mayor al anterior");
        int num2 = scanner.nextInt();

        while(num1 > num2){
            System.out.println("El numero ingresado es menor al primer numero. Vuelva a ingresarlo");
            num2 = scanner.nextInt();
        }

        for(int i=num1; i<=num2; i+=7){
            System.out.println("Numero: "+i);
            count+=1;

            if(i%2 == 0){
                pares+=1;
            } else {
                impares+=i;
            }
        }

        System.out.println("La cantidad de numeros es: "+count);
        System.out.println("La cantidad de pares: "+pares);
        System.out.println("La suma de los impares: "+impares);
    }
}

