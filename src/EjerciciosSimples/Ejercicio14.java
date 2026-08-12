package EjerciciosSimples;

// 14. Calcular la suma de los cuadrados de los números pares entre el 0 y el 100.
public class Ejercicio14 {
    public static void main(String[] args){
        int suma=0;

        for(int i=0; i<=100; i++){
            if(i%2 == 0){
                suma += i * i;
                System.out.println("El cuadrado de "+i+" es: "+i*i);
            }
        }
        System.out.println("La suma de los cuadrados es: "+suma);
    }
}

