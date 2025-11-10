public class persone {
    private String nom;
    private int annee;
    public persone(String nom , int annee){
        this.nom=nom;
        this.annee=annee;
    }

    public String getNom() {
        return nom;
    }
    public int getAnnee() {
        return annee;
    }
    public void afficher(){
        System.out.println(getNom()+""+getAnnee());
    }
}
