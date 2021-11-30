package Examen;

import java.util.Scanner;

public class IncredibleCalculator {

    public static void main(String[] args) {
        int aux1 = 0;
        int aux2 = 0;

        System.out.println("Selecciona la operaci�n que prefieras realizar: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir (divisi�n entera)");
        System.out.println("5. Dividir (divisi�n con decimales)");

        int opcion = leerEnteroEntrada();


        switch (opcion) {
            case 1: //Sumar. Debes leer dos numeros enteros de entrada e imprimir su suma
                System.out.println("Introduce el primer termino");
                aux1 = leerEnteroEntrada();
                System.out.println("Introduce el primer termino");
                aux2 = leerEnteroEntrada();
                System.out.printf("%d", suma(aux1, aux2));
                break;
            case 2: // Restar. Debes leer dos n�meros enteros de entrada e imprimir su resta
                System.out.println("Introduce el primer termino");
                aux1 = leerEnteroEntrada();
                System.out.println("Introduce el primer termino");
                aux2 = leerEnteroEntrada();
                System.out.printf("%d", resta(aux1, aux2));
                break;
            case 3: // Multiplicar. Debes leer dos n�meros enteros de entrada e imprimir su producto.
                System.out.println("Introduce el primer termino");
                aux1 = leerEnteroEntrada();
                System.out.println("Introduce el segundo termino");
                aux2 = leerEnteroEntrada();
                multiplicacion(aux1, aux2);
                break;
            case 4: // Multiplicar. Debes leer dos n�meros enteros de entrada e imprimir su divisi�n entera.
                System.out.println("Introduce el primer termino");
                aux1 = leerEnteroEntrada();
                System.out.println("Introduce el segundo termino");
                aux2 = leerEnteroEntrada();
                divisionEntera(aux1, aux2);
                break;
            case 5: // Multiplicar. Debes leer dos n�meros enteros de entrada e imprimir su divisi�n con decimales.
                System.out.println("Introduce el primer termino");
                aux1 = leerEnteroEntrada();
                System.out.println("Introduce el segundo termino");
                aux2 = leerEnteroEntrada();
                divisionEntera(aux1, aux2);
                break;

        }

    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static int divisionEntera(int a, int b) {
        return a / b;
    }

    public static double divisionConDecimales(int a, int b) {
        return a / (b * 1.0);
    }

    public static int leerEnteroEntrada() {
        try {
            Scanner sc = new Scanner(System.in);
            int result = Integer.parseInt(sc.next());
            sc.close();
            return result;
        } catch (NumberFormatException ex) {
            System.err.println("Lo que has introducido no es un n�mero entero!");
            System.exit(1);
            return -1;
        }

    }

}