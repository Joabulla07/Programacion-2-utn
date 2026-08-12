package EjerciciosSimples;

//5.  Hacer  un  programa  que  imprima  los  números  impares  hasta  el  100  y  que  imprima  cuantos  impares  hay

public class Ejercicio5 {
    public static void main(String[] args){
        int suma=0;
        for(int i=0;i<=100;i++){
            if(i%2 != 0){
                suma+=1;
                System.out.println(i);
            }
        }

        System.out.println("Hay "+suma+" impares");
    }
}
