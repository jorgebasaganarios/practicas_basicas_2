/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicando6;

/**
 *
 * @author Jorge
 */

/**
 *
 * @author Jorge
 */
public class TestCilindre {
    public static void main(String[] args) {
            Cercle cercle = new Cercle(5, "verd");
            System.out.println(cercle);
            Cilindre cilindre = new Cilindre(cercle, 12);
            System.out.println(cilindre);
    }
}