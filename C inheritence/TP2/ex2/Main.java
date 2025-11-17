public class Main {
    public static void main(String[] args) {

        persone s= new secretaire("amina", 2000, "safi",7000);
        s.afficher();
        persone e=new enseignant("youssef",1999,"cs",9000,"info");
        e.afficher();
        persone etr=new etudiantR("ali",2001,"cs",15.5);
        etr.afficher();
        persone ett=new etudiantT("hassan",2002,"is",16.5,"ueu");
        ett.afficher();                
        ET.afficherTotalEtudiants();
        System.out.println("Nombre total de ESTIENT: " + persone.getNombrePersones());

    }

    
}
