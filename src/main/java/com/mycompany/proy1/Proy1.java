/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proy1;
import java.util.Scanner;
/**
 *
 * @author JANETH
 */
public class Proy1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tablas de multiplicar");
        System.out.print("Introduce un numero: ");
        int numero = scanner.nextInt();

        // Generar la tabla de multiplicar desde 0 hasta 12
        System.out.println("La tabla del numero " + numero + " del 0 al 12es:");
        for (int i = 0; i <= 12; i++) {
            System.out.println(numero + " * " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}
