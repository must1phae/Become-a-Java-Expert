package ex1;
public class manager extends employe {
    private double prime; 
    public manager(String nom, String prenom , double salaire, double prime){
        super(nom, prenom, salaire);
        this.prime=prime; 
    }
    @Override
    public void afficher(){
        System.out.println("Nom: "+nom+" Prenom: "+prenom+" Salaire: "+salaire+" Prime: "+prime);
    }
}
