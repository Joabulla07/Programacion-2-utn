package EjerciciosSimples;

import java.util.Scanner;

// 12. Imprimir, contar y sumar los múltiplos de 10 hasta un número que introducimos por teclado
public class Ejercicio12 {
    public static void main(String[] args){
        int count=0;
        int suma=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introducir un número: ");
        int numero = scanner.nextInt();

        for(int i=0; i<=numero; i++){
            if(i%10 == 0){
                count+=1;
                suma+=i;
                System.out.println("Numero multiplo de 10: "+i);
            }
        }
        System.out.println("La suma de los multiplois de 10 es: "+suma);
        System.out.println("La cantidad de multiplos de 10 es: "+count);
    }
}

