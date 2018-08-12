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
public class Cercle {
    
    protected double radi = 1.0;
    protected String color = "vermell";
    protected double area;
    
    public Cercle(){
    }
    
    public Cercle(double radi){
        this.setRadi(radi);
    }
    
    public Cercle(double radi, String color){
        this.setRadi(radi);
        this.setColor(color);
    }
    
    public double getRadi(){
        return this.radi;
    }
    public void setRadi(double radi){
        this.radi = radi;
    }
    
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    
    public double calcularArea(){
        area = Math.PI * Math.pow(this.radi, 2);
        return area;
    }
    
    @Override
    public String toString() {
        return " Radi del cercle: "+radi+"/ Color del cercle: "+color+" / "+"Area del cercle: "+calcularArea();
    }
}
