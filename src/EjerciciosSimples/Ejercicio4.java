package EjerciciosSimples;

//4.  Hacer  un  programa  que  imprima  los  números  pares  entre  el  0  al  100

public class Ejercicio4 {
    public static void main(String[] args){
        for(int i=0; i<=100; i++){
            if(i%2 == 0){
                System.out.println("Es par: "+i);
            }
        }
    }
}
