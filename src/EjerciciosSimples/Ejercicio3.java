package EjerciciosSimples;

// 3. Hacer un programa que imprima las sumas de los 100 primeros números enteros

public class Ejercicio3 {
    public static void main(String[] args){
        int suma=0;
        for(int i=0; i<=100; i++){
            suma+=i;
        }
        System.out.println("La suma es: "+suma);
    }
}
