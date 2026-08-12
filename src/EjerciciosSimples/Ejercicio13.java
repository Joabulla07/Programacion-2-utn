package EjerciciosSimples;

import java.util.Scanner;

// 13. Introducir un número por teclado menor que 500. Imprimir, sumar y contar los números que están separadas entre si 8 posiciones, desde ese número al 500
public class Ejercicio13 {
    public static void main(String[] args){
        int count=0;
        int suma=0;
        boolean continuar = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número menor que 500: ");
        int numero=0;

        while(!continuar){
            numero = scanner.nextInt();
            if(numero < 500){
                continuar = true;
            } else {
                System.out.println("El número es mayor a 500, vuelva a ingresarlo.");
            }
        }

        for(int i=numero; i<=500; i+=8){
             count+=1;
             suma+=i;
             System.out.println("Numero: "+i);
        }


        System.out.println("Hay "+count+" cantidad de numeros");
        System.out.println("La suma es: "+suma);
    }
}

