package ex1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        bibliotheque biblio = new bibliotheque();

        biblio.scanOuvrage();
        Scanner ou=new Scanner(System.in);
        System.out.print("Entrez le titre de l'ouvrage à rechercher: ");
        String titreRecherche = ou.nextLine();
      
        
       biblio.chercher(titreRecherche);
    }
    
}
