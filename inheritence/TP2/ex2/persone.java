public class persone {
    private String nom;
    private int annee;   
    private static int nombrePersones = 0;
    public persone(String nom , int annee){
        this.nom=nom;
        this.annee=annee;
        ++nombrePersones;
    }
    public static int getNombrePersones(){
        return nombrePersones;
    }

    public String getNom() {
        return nom;
    }
    public int getAnnee() {
        return annee;
    }
    public void afficher(){
        System.out.println(getNom());
        System.out.println(getAnnee());
    }
}
