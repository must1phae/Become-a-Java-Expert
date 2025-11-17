package ex3;

public class Test {
    public static void main(String[] args) {
        vehicule v1=new voiture("Toyota",2020,4);
        v1.demmarer();
        v1.afficherInfo();
        vehicule v2=new camion("Volvo",2018,15000);
        v2.demmarer();
        v2.afficherInfo();
        vehicule v3=new moto("Honda",2019,"sport");
        v3.demmarer();
        v3.afficherInfo();
    }
    
}
