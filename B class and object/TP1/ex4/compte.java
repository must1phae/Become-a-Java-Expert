import java.util.Scanner;
class compte {
     String NumeroC;
     double solde ;
     compte(String NumeroC,double solde){
        this.NumeroC=NumeroC;
        this.solde=solde;
       create(); 
       chooseOne();
        
    }  
    public void create(){
        Scanner sc=new Scanner(System.in);
        System.out.println("entrer le numero de compte:");
        NumeroC=sc.nextLine();
       
    }
    public void deposer(double m){
       
        Scanner sc=new Scanner(System.in);
        System.out.println("entrer le montant a deposer:");
        m=sc.nextDouble();
        solde=solde+m;
    }
    public void retirer(double r){
        Scanner sc= new Scanner(System.in);
        System.out.println("entrer le montant a retirer:");
        r=sc.nextDouble();
        if(r>solde){
            System.out.println("solde insuffisant");
        }else{
            solde=solde - r;    
        }
    }
    public void afficher(){
        System.out.println("le numero de compte est: "+NumeroC);
        System.out.println("le solde est: "+solde);
    }
    public void chooseOne(){
        Scanner sc =new Scanner(System.in);
        System.out.println("saisir\n 1 pour deposer \t 2 pour retirer \n 3 pour afficher le solde");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                deposer(0);
                break;
            case 2:
                retirer(0);
                break;
            case 3:
                afficher(); 
                break;
            case 0:
                break;
        }
    }
}
