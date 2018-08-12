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
public class Punt2D {
    public int x=0;
    public int y=0;
    
    public Punt2D(){
    }
    
    public Punt2D(int x, int y){
        this.setX(x);
        this.setY(y);
    }
    
    public int getX(){
        return this.x = x;
    }
    public void setX(int x){
        this.x = x;
    }
    
    public int getY(){
        return this.y = y;
    }
    public void setY(int y){
        this.y = y;
    }
    
    @Override
    public String toString(){
        return "Valor x: "+x+" / "+"valor y: "+y;
    }
}
