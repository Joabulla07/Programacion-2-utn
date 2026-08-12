package EjerciciosSimples;

import java.util.Scanner;

// 22. Hacer un programa que imprima el mayor y el menor de una serie de cinco números que vamos introduciendo por teclado.
public class Ejercicio22 {
    public static void main(String[] args){
        int mayor=0;
        int menor=0;

        Scanner scanner = new Scanner(System.in);

        for(int i=1; i<=5; i++){
            System.out.println("Ingrese el numero "+i+": ");
            int numero = scanner.nextInt();

            if(i == 1){
                menor = numero;
                mayor = numero;
            }

            if(numero > mayor){
                mayor = numero;
            }

            if(numero < menor){
                menor = numero;
            }
        }
        System.out.println("El mayor es: "+mayor);
        System.out.println("El menor es: "+menor);
    }
}

