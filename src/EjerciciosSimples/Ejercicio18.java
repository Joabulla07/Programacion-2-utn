package EjerciciosSimples;

import java.util.Scanner;

// 18. Imprimir y contar los múltiplos de 3 desde la unidad hasta un número que introducimos por teclado
public class Ejercicio18 {
    public static void main(String[] args){
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero = scanner.nextInt();

        for(int i=1; i<=numero; i++){
            if(i%3 == 0){
                count+=1;
                System.out.println("Este número es multiplo de 3 "+i);
            }
        }

        System.out.println("La cantidad de multiplos es: "+count);
    }
}

