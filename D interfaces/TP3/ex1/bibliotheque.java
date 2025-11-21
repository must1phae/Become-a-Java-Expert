package ex1;
import java.util.ArrayList;
import java.util.Scanner;
public class bibliotheque {
    private ArrayList<ouvrage> ouvrages;
    private Scanner sc=new Scanner(System.in);
    public bibliotheque(){
        ouvrages=new ArrayList<ouvrage>();
    }
    
    public void ajouterOuvrage(ouvrage o){
        
        ouvrages.add(o);

        System.out.println("Ouvrage ajouté: "+o.titre);
      
    }

   public void afficherTous(){
        if(ouvrages.isEmpty()){
            System.out.println("aucun ouvrage ");
            return;
        }
        for(ouvrage o:ouvrages){
            o.afficher();
        }
   }
   public String chercher(String titre){
    
        if(titre == null){
            return null;
        }
        for(ouvrage o : ouvrages){
            if(o.titre != null && o.titre.equalsIgnoreCase(titre)){
                
                System.out.println("Ouvrage trouvé: " + o.titre);
                return o.titre;
            }
        }
        return null;
   }
   public void emprunter(String titre){
        String foundTitre = chercher(titre);
        if(foundTitre != null){
            System.out.println("Vous avez emprunté l'ouvrage: " + foundTitre);
        } else {
            System.out.println("Ouvrage non trouvé: " + titre);
        }
   }
   
   public void retourner(String titre){
        String foundTitre = chercher(titre);
        if(foundTitre != null){
            System.out.println("Vous avez retourné l'ouvrage: " + foundTitre);
        } else {
            System.out.println("Ouvrage non trouvé: " + titre);
        }
   }
   public void scanOuvrage(){
        System.out.print("Entrez le titre de l'ouvrage: ");
        String titre=sc.nextLine();
        System.out.print("Entrez l'auteur de l'ouvrage: ");
        String auteur=sc.nextLine();
        System.out.print("Entrez l'année de publication de l'ouvrage: ");
        int anneePublication=sc.nextInt();
        sc.nextLine(); 
        ouvrage o=new ouvrage(titre, auteur, anneePublication);
        ajouterOuvrage(o);
        
   }

}
