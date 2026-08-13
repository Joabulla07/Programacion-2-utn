package EjerciciosSimples;

import java.util.Scanner;

// 23. Introducir dos números por teclado. Imprimir los números naturales que hay entre ambos
// números empezando por el más pequeño, contar cuantos hay y cuántos de ellos son pares. Calcular la suma de los impares.
public class Ejercicio23 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        int count=0;
        int par=0;
        int impar=0;

        int inicial=0;
        int fin=0;

        if(num1 > num2){
            inicial=num2;
            fin=num1;
        } else {
            inicial=num1;
            fin=num2;
        }

        for(int i=inicial+1; i<fin; i++){
            System.out.println("Numero: "+i);
            count+=1;
            if(i%2 == 0){
                par+=1;
            } else {
                impar+=i;
            }
        }
        System.out.println("Entre el numero "+inicial+" y el numero "+fin+" hay "+count+" numero");
        System.out.println("Hay numeros pares: "+par);
        System.out.println("La suma de los impares es: "+impar);
    }
}

