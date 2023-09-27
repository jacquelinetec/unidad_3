/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad3;

import java.util.Scanner;

/**
 *
 * @author Jacqueline Sarabia
 */
public class Unidad3 {

     public static void main(String[] args) {
        
         try (Scanner lectura = new Scanner(System.in)) {
             int num;
             System.out.println("Ingresa un numero");
             num = lectura.nextInt();
             
             if (num % 2 == 0)
             {
                 System.out.println("El numero ingresado si es par");
             }
             else
             {
                 System.out.println("El numero ingresado no es par");
             }}
    }
    
}