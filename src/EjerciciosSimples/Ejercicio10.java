package EjerciciosSimples;

// 10. Hacer un algoritmo que imprima y cuente los múltiplos de 5 que hay entre 1 y 500
public class Ejercicio10 {
    public static void main(String[] args){
        int suma=0;
        for(int i=1; i<=500; i++){
            if(i%5 == 0){
                suma+=1;
                System.out.println("Numero multiplo de 5: "+i);
            }
        }
        System.out.println("La cantidad de multiplos de 5 es: "+suma);
    }
}

