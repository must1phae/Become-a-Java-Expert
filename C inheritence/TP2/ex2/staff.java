public class staff extends persone {
    private String nomLabo;
    private double salaire;
    public staff(String nom , int annee , String nomLabo , double salaire){ 
       super(nom,annee);
       this.nomLabo=nomLabo;
       this.salaire=salaire;

    }
    
    String getNomLabo() {
        return nomLabo;
    }
    double getSalaire() {
        return salaire;
    }
    @Override
    public void afficher() {
        super.afficher();
        System.out.println("nom de laboratoire: "+getNomLabo());
        System.out.println("salaire: "+getSalaire());
    }

    
}
        

