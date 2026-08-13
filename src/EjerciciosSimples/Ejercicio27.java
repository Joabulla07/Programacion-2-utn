package EjerciciosSimples;

import java.util.Scanner;

// 27. Imprimir y contar los números, que son a la vez múltiplos de 2 y 3, que hay entre la unidad y el determinado número.
public class Ejercicio27 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");

        int numero = scanner.nextInt();

        int suma=0;

        for(int i=1; i<=numero; i++){
            if(i%2 == 0 && i%3 == 0){
                suma+=1;
                System.out.println("Numero: "+i);
            }
        }
        System.out.println("La cantidad de multiplos de 2 y 3 es: "+suma);
    }
}

