package ex3;

public class vehicule  {
    protected  String marque;
    protected int annee;
    protected static int nombrevehicule=0;
    public vehicule(String marque, int annee){
        this.marque=marque;
        this.annee=annee;
        nombrevehicule++;

    }
    public void demmarer(){
        System.out.println("le vehicule demmere ");

        }
    public void afficherInfo(){
        System.out.println("marque : "+marque+" annee de fabrication :"+annee);
    }
    
    
}
