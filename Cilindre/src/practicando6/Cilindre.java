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
public class Cilindre extends Cercle{
    public double altura = 1.0;
    
    public Cilindre(){
        super();
        this.setAltura(altura);
    }
    public Cilindre(double altura){
        this.setAltura(altura);
    }    
    public Cilindre(double altura, double radi){
        super(radi);
        this.setAltura(altura);
    } 
    
    public Cilindre(Cercle cercle, double altura){
        this.radi = cercle.getRadi();
        this.color = cercle.getColor();
        this.setAltura(altura);
    }    
    
    public double getAltura(){
        return this.altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
          
    public double calcularVolum(){
        return calcularArea() * this.altura;
    }
    
    @Override
    public String toString() {
        return " Radi: "+radi+" / Altura: "+getAltura()+" / Volum del cilindre: "+calcularVolum();
    }
}
