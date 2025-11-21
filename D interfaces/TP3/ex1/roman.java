package ex1;

public class roman extends ouvrage {
    protected String genre;
    public roman(String titre, String auteur, int anneePublication, String genre){
        super(titre,auteur,anneePublication);
        this.genre=genre;
        System.out.println("Roman :");
    }
    @Override
    public void afficher(){
        super.afficher();
        System.out.println("Genre: "+genre);
    }
   
}