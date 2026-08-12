package EjerciciosSimples;

// 19. Hacer un programa que imprima los números del 1 al 100. que calcule la suma de todos los
// números pares por un lado y otro la de todos los impares.
public class Ejercicio19 {
    public static void main(String[] args){

        int pares=0;
        int impares=0;

        for(int i=1; i<=100; i++){
            System.out.println("Numero: "+i);
            if(i%2 == 0){
                pares+=i;
            } else {
                impares+=i;
            }
        }
        System.out.println("La suma de los pares: "+pares);
        System.out.println("La suma de los impares: "+impares);
    }
}

