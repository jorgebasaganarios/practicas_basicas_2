/**
 *
 * @author Jorge Basagaña Rios / Examen M3 / 28 Noviembre 2017
 */
public class Estudiant {
    private Assignatura[] assignatures = new Assignatura[10];
    private int edat;
    private String nom;
    private double mitjana = 0;
    
    private int comptadorAss=0;    
    private String mostraText = "";
    
   public Estudiant(String nom, int edat){
       this.nom = nom;
       this.edat = edat;
   }
   
   public String getNom() {
        return nom;
   }   
   public void setNom(String nom){
       this.nom = nom;
   }
   
   public int getEdat() {
        return edat;
   }   
   public void setEdat(int edat){
       this.edat = edat;
   }
   
   public double notaMitjana(){
       int sumaNotes = 0;
       for(int i=0; i < comptadorAss; i++){
           sumaNotes = sumaNotes + this.assignatures[i].getNota();
       }
       
       if (comptadorAss > 0) {
        mitjana = sumaNotes / comptadorAss;
           
        }
       return mitjana;
   }
      
   public void afegirAssignatura(Assignatura assignatura) {
       boolean trobat = false; //Se declara aquí variable sino se quedaría como true en caso de haber antes un valor true.
       if (comptadorAss < this.assignatures.length) {
            for (int i = 0; i < comptadorAss; i++) {
                if(this.assignatures[i].getAssignatura() == assignatura.getAssignatura()){
                    
                    trobat = true;
                }
            }
            if (trobat == false) {
                this.assignatures[comptadorAss] = assignatura;
                comptadorAss = comptadorAss + 1;
            }
        }
    }
   
   public String mostrarAssignatures(){
       for (int i = 0; i < (comptadorAss); i++) {
                 mostraText = mostraText + this.assignatures[i];
        }
       return mostraText;
   }
   
   @Override
    public String toString() {
        return "Nom de l'alumne: " + this.getNom() + "\n -Edat:" + this.getEdat() + "\n -Assignatures cursades: " + this.mostrarAssignatures() + "\n -Media: " + this.notaMitjana();
    }
}
