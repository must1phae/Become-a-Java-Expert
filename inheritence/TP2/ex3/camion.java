package ex3;


public class camion extends vehicule{
    protected double capacitecharge; 
    public camion(String marque, int annee, double capacitecharge){
        super(marque, annee);
        this.capacitecharge=capacitecharge;

    }
    @Override
    public void demmarer(){
        System.out.println("le camion demmare en moteur diesel  puissant ");
    }
    
}
