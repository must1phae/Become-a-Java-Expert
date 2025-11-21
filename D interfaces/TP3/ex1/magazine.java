package ex1;
public class magazine extends ouvrage {
    protected String moisPublication;
    public magazine(String titre, String auteur, int anneePublication, String moisPublication){
        super(titre, auteur, anneePublication);
        this.moisPublication=moisPublication;
        System.out.println("Magazine :");   
        
    }
    @Override
    public void afficher(){
        super.afficher();
        System.out.println("Mois de publication: "+moisPublication);
    }
    @Override
    public void emprunter(){
        System.out.println("Les magazines ne peuvent pas être empruntés.");
    }
}
