/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicando5;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class inicio {
    private static final Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        for(int i=1;i<11;i++)
        {
            metodos nuevo = new metodos(i);
            System.out.println(nuevo);
            
            System.out.println("Prueba: "+nuevo.sumar(5));
        }
    }
}