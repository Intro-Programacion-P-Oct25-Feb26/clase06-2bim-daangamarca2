/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author A S U S A16
 */
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
        int valor;
        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingresa un valor: ");
            valor = entrada.nextInt();

            if (valor > 0 && valor % 2 == 0) {
                bandera = false;
                return valor;
            } else {
                System.out.println("Valor no válido");
            }
        }
    }

}
