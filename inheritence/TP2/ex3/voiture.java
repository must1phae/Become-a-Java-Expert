package ex3;

public class voiture  extends vehicule {
    protected int nombreportes;

    public voiture(String marque, int annee, int nombreportes){
        super(marque, annee);
        this.nombreportes=nombreportes;

    }
    @Override
    public void demmarer(){
    System.out.println("la vaoiture demmare en essence ");

    }
    
}
