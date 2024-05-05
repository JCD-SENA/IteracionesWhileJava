package juanca.iteracioneswhilejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ejercicio 3
Un programa que le pregunte al usuario por un limite y el valor que se incrementa, mientras se ejecuta el ciclo solo se muestran los números impares.
*/

public class Ejercicio3 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int end, adding, i=0;
        System.out.print("Limite: ");
        end = Integer.parseInt(input.readLine());
        System.out.print("Pasos: ");
        adding = Integer.parseInt(input.readLine());
        while (i<=end) {
            System.out.println(i);
            i += adding;
        }
    }
}
