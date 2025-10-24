package programas;

import java.util.Scanner;

/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
    
 */
 /*

/**
 *
 * @author rosen
 */
public class programa04_libreria_scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);

        int num1, num2, result = 0;
        System.out.println("Dame un valor: ");
        num1 = teclado.nextInt();

        System.out.println("Dame un valor: ");
        num2 = teclado.nextInt();

        result = num1 + num2;

        System.out.println("-----------------------------");
        System.out.println("Suma: " + result);

    }
}
