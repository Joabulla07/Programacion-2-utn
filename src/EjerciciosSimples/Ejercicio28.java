package EjerciciosSimples;

import java.util.Scanner;

// 28. Introducir una serie de números. Sumar los múltiplos de 5. Cual es el mayor y cuántos números se han introducido.
public class Ejercicio28 {
    public static void main(String[] args){
        char seguir = 's';
        Scanner scanner = new Scanner(System.in);
        int mayor = 0;
        int count = 0;
        int sum = 0;

        while (seguir == 's'){
            System.out.println("Ingrese un número");
            int num = scanner.nextInt();
            count+=1;
            if(num%5 == 0){
                sum+=num;
            }

            if(num > mayor){
                mayor = num;
            }

            System.out.println("Desea ingresar otro numero? (s/n)");
            seguir = scanner.next().charAt(0);
        }
        System.out.println("El mayor es: "+mayor);
        System.out.println("La cantidad de numeros ingresados es: "+count);
        System.out.println("La suma de los multiplos de 5 es: "+sum);
    }
}

