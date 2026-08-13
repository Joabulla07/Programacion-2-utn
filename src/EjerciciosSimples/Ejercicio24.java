package EjerciciosSimples;

import java.util.Scanner;

// 24. Introducir una serie de números. Decir si esos números son mayores o menores de 10.
public class Ejercicio24 {
    public static void main(String[] args){
        char seguir = 's';
        Scanner scanner = new Scanner(System.in);

        while (seguir == 's'){
            System.out.println("Ingrese un número");
            int num = scanner.nextInt();

            if(num > 10){
                System.out.println("El numero ingresado es mayor a 10");
            } else {
                System.out.println("El numero ingresado es menor a 10");
            }

            System.out.println("Desea ingresar otro numero? (s/n)");
            seguir = scanner.next().charAt(0);
        }
    }
}

