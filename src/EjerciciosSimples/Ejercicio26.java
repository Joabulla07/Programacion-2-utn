package EjerciciosSimples;

import java.util.Scanner;

// 26. Imprimir y sumar los números desde el cero hasta un número determinado,
// excepto los múltiplos de 5 imprimir el valor de la suma de los múltiplos de 5.
public class Ejercicio26 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");

        int numero = scanner.nextInt();

        int suma=0;

        for(int i=0; i<=numero; i++){
            suma+=i;
            System.out.println("Numero: "+i);
        }
        System.out.println("La suma es: "+suma);
    }
}
