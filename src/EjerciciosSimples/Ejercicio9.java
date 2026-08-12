package EjerciciosSimples;

// 9. Hacer un programa que calcule la suma de los números impares comprendidos entre el 0 y el 100
public class Ejercicio9 {
    public static void main(String[] args){
        int suma=0;

        for(int i=0; i<=100; i++){
            if(i%2 != 0){
                suma+=i;
            }
        }
        System.out.println("La suma de los impares es: "+suma);
    }
}

