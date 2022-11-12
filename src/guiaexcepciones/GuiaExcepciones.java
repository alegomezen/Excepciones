package guiaexcepciones;

import Entidad.ClasePruebaEjer1;
import Entidad.DivisionNumero;
import java.util.Scanner;
import java.util.InputMismatchException;
public class GuiaExcepciones {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //ClasePruebaEjer1 serv1 = new ClasePruebaEjer1();
        //int[] vector1 = serv1.crearVector();
        //serv1.llenarVector(vector1);
        
        try{
        DivisionNumero serv2 = new DivisionNumero();
        System.out.println("Ingrese el primer numero: ");
        serv2.setNum1(leer.next());
        int num1 = Integer.parseInt(serv2.getNum1());
        System.out.println("Ahora, ingrese otro numero: ");
        serv2.setNum2(leer.next());
        int num2 = Integer.parseInt(serv2.getNum2());
        double division = num1/num2;
        System.out.println("El primer numero es "+num1+" y el segundo "+num2+".");
        System.out.println("El cociente entre los numeros es: "+division+".");
        }catch(Exception a){
            System.out.println("Ha ocurrido un error! Pudo ser causado por lo siguiente: ");
            System.out.println("Alguno/s de los numeros es 0");
            System.out.println("Hubo un error al ingresar los numeros.");
            System.out.println("La cadena no puede ser convertida a un numero entero.");
        }
         
        /*
        try {
            DivisionNumero serv2 = new DivisionNumero();
            System.out.println("Ingrese el primer numero: ");
            serv2.setNum1(leer.next());
            int num1 = Integer.parseInt(serv2.getNum1());
            System.out.println("Ahora, ingrese otro numero: ");
            serv2.setNum2(leer.next());
            int num2 = Integer.parseInt(serv2.getNum2());
            double division = num1 / num2;
            System.out.println("El primer numero es " + num1 + " y el segundo " + num2 + ".");
            System.out.println("El cociente entre los numeros es: " + division + ".");
        }catch(NumberFormatException a){
            System.out.println("La cadena ingresada no pudo convertirse a enteros");
        }
        */
        /*
        try {
            DivisionNumero serv2 = new DivisionNumero();
            System.out.println("Ingrese el primer numero: ");
            serv2.setNum1(leer.next());
            int num1 = Integer.parseInt(serv2.getNum1());
            System.out.println("Ahora, ingrese otro numero: ");
            serv2.setNum2(leer.next());
            int num2 = Integer.parseInt(serv2.getNum2());
            double division = num1 / num2;
            System.out.println("El primer numero es " + num1 + " y el segundo " + num2 + ".");
            System.out.println("El cociente entre los numeros es: " + division + ".");
        }catch(ArithmeticException a){
            System.out.println("Alguno/s de los numeros es 0");
        }
        */
        /*
        try {
            DivisionNumero serv2 = new DivisionNumero();
            System.out.println("Ingrese el primer numero: ");
            serv2.setNum1(leer.next());
            int num1 = Integer.parseInt(serv2.getNum1());
            System.out.println("Ahora, ingrese otro numero: ");
            serv2.setNum2(leer.next());
            int num2 = Integer.parseInt(serv2.getNum2());
            double division = num1 / num2;
            System.out.println("El primer numero es " + num1 + " y el segundo " + num2 + ".");
            System.out.println("El cociente entre los numeros es: " + division + ".");
        }catch(InputMismatchException a){
            System.out.println("El tipo de dato ingresado no es el esperdo. Asegurese de ingresar solo numeros.");
        }
      */
    }

}
