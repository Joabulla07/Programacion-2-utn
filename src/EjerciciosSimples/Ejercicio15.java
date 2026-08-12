package EjerciciosSimples;

import java.util.Scanner;

// 15. Introducir un número por teclado menor que 100. imprimir la suma de los cuadrados de los números que están separados entre sí 4 posiciones.
public class Ejercicio15 {
    public static void main(String[] args){
        int suma=0;
        boolean continuar = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número menor que 100: ");
        int numero=0;

        while(!continuar){
            numero = scanner.nextInt();
            if(numero < 100){
                continuar = true;
            } else {
                System.out.println("El número es mayor a 100, vuelva a ingresarlo.");
            }
        }

        for(int i=numero; i<=500; i+=4){
             int cuadrado=i*i;
             suma+=cuadrado;
             System.out.println("El cuadrado del Numero "+i+" es: "+cuadrado);
        }

        System.out.println("La suma de los cuadrados es: "+suma);
    }
}

