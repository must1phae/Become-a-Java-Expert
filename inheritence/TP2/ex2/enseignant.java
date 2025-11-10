public class enseignant extends staff{
    private String nomSection;
    public enseignant(String nom, int annee, String nomLabo, double salaire, String nomSection){
        super(nom,annee,nomLabo,salaire);
        this.nomSection = nomSection;

    }
    @Override
    public void afficher(){
        super.afficher();
        System.out.println(nomSection);

    }
    public void afficher1(){
        System.out.println(nomSection);
    }
    
    
}
