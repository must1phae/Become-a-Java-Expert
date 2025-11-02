package ex1;

class employe{
    protected String nom;
    protected String prenom;
    protected double salaire;
    public employe(String nom, String prenom, double salaire ){
        this.nom=nom; 
        this.prenom=prenom;
        this.salaire=salaire;
    }
    public void afficher(){
        System.out.println("Nom: "+nom+" Prenom: "+prenom+" Salaire: "+salaire);
    } 

}