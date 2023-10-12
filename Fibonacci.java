/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package fibonacci; 

import java.util.Scanner;


/**
 *
 * @author Jacqueline Sarabia
 */

public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Ingresa el numero ");
        int n = input.nextInt();
        long[] serie = new long[n];
        serie[0] = 0;
        if (n > 1) {
            serie[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            serie[i] = serie[i - 1] + serie[i - 2];
        }
        System.out.print("Serie  de " + n + " numeros: ");
        for (int i = 0; i < n; i++) {
            System.out.print(serie[i] + " ");
        }
    }
}
