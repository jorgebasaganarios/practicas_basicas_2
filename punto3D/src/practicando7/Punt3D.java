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
public class Punt3D extends Punt2D {
    public int z = 0;
    
    public Punt3D(){
        super();
    }
    
    public Punt3D(int z){
        this.setZ(z);
    }
    
    public Punt3D(Punt2D punt2d, int z){
        this.x = punt2d.getX();
        this.y = punt2d.getY();
        this.setZ(z);
    }
    
    public int getZ(){
        return this.z = z;
    }
    public void setZ(int z){
        this.z = z;
    }
    
    public String toString(){
        return "Punto 3D: "+x+", "+y+", "+this.z;
    }
}
