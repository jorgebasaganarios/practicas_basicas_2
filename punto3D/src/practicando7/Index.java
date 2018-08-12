/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicando7;

/**
 *
 * @author Jorge
 */
public class Index {
    public static void main(String[] args){
        Punt2D punto2d = new Punt2D(3, 5);
        System.out.println(punto2d);
        Punt3D punto3d = new Punt3D(punto2d, 4);
        System.out.println(punto3d);
    }
}
