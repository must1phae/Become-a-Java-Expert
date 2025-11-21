package ex1;

public class ouvrage {
    protected String titre; 
    protected String auteur;
    protected int anneePublication;
    protected static int nombreOuvrages=0;
    protected boolean disponible;
    public ouvrage(String titre, String auteur, int anneePublication){
        this.titre=titre;
        this.auteur=auteur;
        this.anneePublication=anneePublication;
        nombreOuvrages++;
        this.disponible=true;
    }
    public void afficher(){
        System.out.println("Titre: "+titre);
        System.out.println("Auteur: "+auteur);
        System.out.println("Année de publication: "+anneePublication);
        System.out.println("Disponible: "+disponible);
    }
    public void emprunter(){
        if(disponible){
            disponible=false;
            System.out.println("Vous avez emprunté l'ouvrage: "+titre);
        }else{
            System.out.println("L'ouvrage: "+titre+" n'est pas disponible pour le moment.");
        }
    }
    public void retourner(){
         if(disponible){
            disponible=true;
            System.out.println("l ouvre et retourner ");         }
    
        else{
               System.out.println("l ouvrage n est pas empreinté");
        }
     
         }
    public String getTitre(){
        return titre;
    }

}
