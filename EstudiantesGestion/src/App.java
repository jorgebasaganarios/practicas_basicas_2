/**
 *
 * @author Jorge Basagaña Rios / Examen M3 / 28 Noviembre 2017
 */
public class App {
     public static void main(String[] args) {
        
        Estudiant alumne1=new Estudiant("Jorge Basagaña Rios", 35);
        Estudiant alumne2=new Estudiant("Juanma García", 37);
        Estudiant alumne3=new Estudiant("Alexis Fernández", 20);
        Estudiant alumne4=new Estudiant("Xiance Lee", 23);
        
        Assignatura ass1 = new Assignatura("M5", 2);
        Assignatura ass2 = new Assignatura("M3", 9);
        Assignatura ass3 = new Assignatura("M8", 10);
        Assignatura ass4 = new Assignatura("M7", 7);      
        Assignatura ass5 = new Assignatura("M3", 6);
        Assignatura ass6 = new Assignatura("M5", 10);        
        Assignatura ass7 = new Assignatura("M8", 5);      
        Assignatura ass8 = new Assignatura("M2", 7);       
        Assignatura ass9 = new Assignatura("M7", 8);
        
        alumne1.afegirAssignatura(ass1);
        alumne1.afegirAssignatura(ass2);
        alumne2.afegirAssignatura(ass3);
        alumne3.afegirAssignatura(ass4);
        alumne2.afegirAssignatura(ass5);
        alumne2.afegirAssignatura(ass6);
        alumne3.afegirAssignatura(ass7);
        alumne3.afegirAssignatura(ass8);
        alumne4.afegirAssignatura(ass9);
        
        System.out.println(alumne1);
        System.out.println(alumne2);
        System.out.println(alumne3);
        System.out.println(alumne4);
        
    }
}
