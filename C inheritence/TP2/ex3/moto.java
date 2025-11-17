package ex3;
public class moto extends vehicule {
    protected String typeguidon; 
    public moto(String marque, int annee, String typeguidon ){
        super(marque,annee);
        this.typeguidon=typeguidon;
        System.out.println("Moto :");
    }
    @Override
    public void demmarer(){
        System.out.println("le moteur demmare en tourne la poigné");
    }


    
}
