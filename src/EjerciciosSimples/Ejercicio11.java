package EjerciciosSimples;

import java.util.Scanner;

// 11. Imprimir, contar y sumar los múltiplos de 2 hasta un número que introducimos por teclado
public class Ejercicio11 {
    public static void main(String[] args){
        int count=0;
        int suma=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introducir un número: ");
        int numero = scanner.nextInt();

        for(int i=0; i<=numero; i++){
            if(i%2 == 0){
                count+=1;
                suma+=i;
                System.out.println("Numero multiplo de 2: "+i);
            }
        }
        System.out.println("La suma de los multiplois de 2 es: "+suma);
        System.out.println("La cantidad de multiplos de 2 es: "+count);
    }
}

