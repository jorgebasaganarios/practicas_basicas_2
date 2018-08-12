/**
 *
 * @author Jorge Basagaña Rios / Examen M3 / 28 Noviembre 2017
 */
public class Assignatura {
    private String assignatura;
    private int nota;
    private String resultat;
    
   public Assignatura(String assignatura, int nota){
       this.assignatura = assignatura;
       this.nota = nota;
   }
   
   public String getAssignatura() {
        return assignatura;
    }
   
   public int getNota(){
       return nota;
   }
   public void setNota(int nota){
       this.nota = nota;
   }
   
   public String comprovaNota(int nota){
       String resultado = "";
       if(nota<5){
           resultado = "Ha suspendido.";
       }else{
           resultado = "Ha aprovado.";
       }
       return resultado;
   }
   
   @Override
    public String toString() {
        return " [ Assignatura: " + this.getAssignatura() + " / Nota: " + this.getNota() + " / Resultado: " + this.comprovaNota(this.nota) + " ]";
    }
}