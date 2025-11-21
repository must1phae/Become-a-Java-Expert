package ex1;

public class livre extends ouvrage {
    protected int nombrePages;
    public livre(String titre,String auteur,int anneePublication,int nombrePages){
        super(titre,auteur,anneePublication);
        this.nombrePages=nombrePages;
        System.out.println("Livre :");

    }
    @Override
    public void afficher(){
        super.afficher();
        System.out.println("Nombre de pages: "+nombrePages);
    }
    
    
    
}
