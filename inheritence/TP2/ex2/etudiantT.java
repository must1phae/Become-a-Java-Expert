public class etudiantT extends ET {
    private static int nombreEtudiantsT = 0;
    
    public etudiantT(String nom , int annee, String section, double moyenne, String uniorigine){ 
       super(nom,annee,section,moyenne,uniorigine);
       nombreEtudiantsT++;
       System.out.println("Etudiant Transferé :");

    }
    public static int getNombreEtudiantsT(){
        return nombreEtudiantsT;
    }
    
    @Override

    public void afficher() {
        super.afficher();
        System.out.println(getSection());
        System.out.println(getMoyenne());
        System.out.println(getUniorigine());

    }
    
}
