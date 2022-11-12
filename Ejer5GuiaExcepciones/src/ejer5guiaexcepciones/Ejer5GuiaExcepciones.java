package ejer5guiaexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ejer5GuiaExcepciones {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int num = 0;
        int contador = 0;
        int numeroSecreto = random.nextInt(1, 500 + 1);
        System.out.println(numeroSecreto);

        do {

            System.out.println("Ingrese un numero para jugar: ");

            try {
                num = leer.nextInt();
                if (num != numeroSecreto && num < numeroSecreto) {
                    System.out.println("El numero ingresado es menor al secreto! Siga intentando: ");
                } else {
                    if (num != numeroSecreto && num > numeroSecreto) {
                        System.out.println("El numero ingresado es mayor al secreto! Siga intentando: ");
                    }
                }
                contador++;
            } catch (InputMismatchException a) {
                System.out.println("No se ingresó un número válido! Se le sumará un intento fallido.");
                leer.next(); //Para borrar el caché en memoria
                contador++;
                
            }
        } while (num != numeroSecreto);
        System.out.println("Acertó el numero secreto! Necesitó " + contador + " intentos.");
    }

}
