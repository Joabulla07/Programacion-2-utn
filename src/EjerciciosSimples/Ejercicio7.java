package EjerciciosSimples;

import java.util.Scanner;

// 7. Hacer un programa que imprima todos los números naturales que hay desde la unidad hasta un número introducido por teclado
public class Ejercicio7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        for(int i=1; i<=numero; i++){
            System.out.println(i);
        }
    }
}

