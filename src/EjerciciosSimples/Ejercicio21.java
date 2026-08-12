package EjerciciosSimples;

// 21. Imprimir y contar los números que son múltiplos de 2 y 3 que hay del 1 al 100.
public class Ejercicio21 {
    public static void main(String[] args){
        int count=0;

        for(int i=1; i<=100; i++){
            if(i%2 == 0 && i%3 == 0) {
                count += 1;
                System.out.println("Numero multiplo de 2 y 3: " + i);
            }
        }
        System.out.println("La cantidad de multiplos de 2 y 3 son: "+count);
    }
}

