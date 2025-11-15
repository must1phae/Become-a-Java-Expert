public class ET extends persone {
    String section;
    double moyenne;
    String uniorigine;
    public ET(String nom , int annee, String section, double moyenne, String uniorigine){ 
        super(nom,annee);
        this.section = section;
        this.moyenne = moyenne;
        this.uniorigine = uniorigine;
    

    }
    
    String getSection() {
        return section;
    }
    double getMoyenne() {
        return moyenne;
    }
    String getUniorigine() {
        return uniorigine;
    }
    
    public static void afficherTotalEtudiants() {
        int total = etudiantR.getNombreEtudiantsR() + etudiantT.getNombreEtudiantsT();
        System.out.println("Nombre total d'etudiants: " + total);
    }

}
