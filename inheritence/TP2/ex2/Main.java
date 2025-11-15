public class Main {
    public static void main(String[] args) {

        secretaire s= new secretaire("amina", 2000, "safi",7000);
        s.afficher();
        enseignant e=new enseignant("youssef",1999,"cs",9000,"info");
        e.afficher();
        etudiantR etr=new etudiantR("ali",2001,"cs",15.5);
        etr.afficher();
        etudiantT ett=new etudiantT("hassan",2002,"is",16.5,"ueu");
        ett.afficher();                
        ET.afficherTotalEtudiants();
        System.out.println("Nombre total de ESTIENT: " + persone.getNombrePersones());

    }

    
}
