/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete02;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author A S U S A16
 */
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {
        int valor1 = obtenerValores();
        int valor2 = obtenerValores();
        int resultadoSuma = sumarValores(valor1, valor2);
        presentarReporte(valor1, valor2, resultadoSuma);
    }

    public static int obtenerValores() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int valor = 0;
        boolean bandera = true;

        while (bandera) {
            try {
                System.out.println("Ingresa un valor: ");
                valor = entrada.nextInt();

                if (valor > 0 && valor % 2 == 0) {
                    bandera = false;
                } else {
                    throw new Exception ("Valor ingresado es invalido");
                }
            } catch (Exception e) {
                System.out.printf("Existe un error de tipo: %s\n", e);
                entrada.nextLine();
            }
        }
        return valor;
    }

    public static int sumarValores(int n1, int n2) {
        return n1 + n2;
    }

    public static void presentarReporte(int n1, int n2, int suma) {
        System.out.printf("La suma del valor 1: %d + el valor 2: %d es %d\n",
                n1, n2, suma);
    }
}
