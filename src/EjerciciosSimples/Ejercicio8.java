package EjerciciosSimples;

// 8. Hacer un programa que imprima y cuente los múltiplos de 3 que hay entre 1 y 100
public class Ejercicio8 {
    public static void main(String[] args){
        int suma = 0;

        for(int i=1; i<=100; i++){
            if(i%3 == 0){
                suma+=1;
                System.out.println("Número multiplo de 3: "+i);
            }
        }
        System.out.println("La cantidad de múltiplos es: "+suma);
    }
}

