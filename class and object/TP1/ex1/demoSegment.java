public class demoSegment {
    public static void main(String[] args){
        segment S1 = new segment(24.0,10.0);
       
       System.out.println(S1.toString());
        System.out.println("longueur = "+S1.getLongueur());
        System.out.println("15.0 appartient ? "+S1.appartient(15.0));
    }

}
    