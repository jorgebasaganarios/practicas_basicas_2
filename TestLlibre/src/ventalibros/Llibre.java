package ventalibros;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge
 */
public class Llibre {   
    
    private String nom;
    private String autor;
    private double preu;
    private int quantitat;  
    
    public Llibre (String nom, String autor, double preu, int quantitat){
        this.nom = nom;
        this.autor = autor;
        this.preu = preu;
        this.quantitat = quantitat;
    }
    
    public String getNom(){
        return nom;
    }
       
    public String getAutor(){
        return autor;
    }
        
    public double getPreu(){
        return preu;
    }
    public void setPreu(double preu){
        this.preu = preu;
    }
    
    public double getQuantitat(){
        return quantitat;
    }
    public void setQuantitat(int quantitat){
        this.quantitat = quantitat;
    }
       
}