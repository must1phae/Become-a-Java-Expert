public class etudiantR extends ET {
    private static int nombreEtudiantsR = 0;
    
    public etudiantR(String nom , int annee, String section, double moyenne){ 
         super(nom,annee,section,moyenne,"N/A");
         nombreEtudiantsR++;
         System.out.println("Etudiant Régulier :");

    }
    public static int getNombreEtudiantsR(){
        return nombreEtudiantsR;
    }
    
    @Override
    public void afficher() {
        super.afficher();
        System.out.println(getSection());
        System.out.println(getMoyenne());

    }
    
}
