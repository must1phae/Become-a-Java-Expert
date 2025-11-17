import java.util.Scanner;
class etudiant {
    String nom;
    int age; 
    float note1;
    float note2;
    float note3;
    public etudiant(String nom, int age, float note1, float note2, float note3){
        this.nom=nom;
        this.age=age;
        this.note1=note1;
        this.note2=note2;
        this.note3=note3;
        lire();
    }
    public void lire(){
        Scanner sc =new Scanner(System.in);
        System.out.println("entrer le nom de l'etudiant:");
        nom=sc.nextLine();
        System.out.println("entrer l age de l'etduaint:");
        age= sc.nextInt();
        System.out.println("entrer la 1 ere note:");
        note1=sc.nextFloat();
        System.out.println("entrer la 2 eme note:");
        note2=sc.nextFloat();
        System.out.println("entrer la 3 eme note:");
        note3=sc.nextFloat();

    }
    public float moyenne(){
        return (note1+note2+note3)/3;
    }
    public void afficher(){
        System.out.println("nom: "+nom);
        System.out.println("age: "+age);
        System.out.println("note1: "+note1);
        System.out.println("note2: "+note2);
        System.out.println("note3: "+note3);
        System.out.println("moyenne: "+moyenne());
        if (moyenne()>=10) {
            System.out.println("l'etudiant est admis");
        } else {
            System.out.println("l'etudiant est non admis");
            
        }
    }


    
}
