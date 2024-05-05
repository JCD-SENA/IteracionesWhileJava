package juanca.iteracioneswhilejava;

/*
Ejercicio 1
Un programa que muestre todos los caracteres visibles (33-126).
*/

public class IteracionesWhileJava {
    public static void main(String[] args) {
        int c = 33;
        while (c<=126) {
            System.out.print((char)c++);
        }
    }
}
