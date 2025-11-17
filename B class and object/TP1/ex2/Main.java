
public class Main {
    
    public static void main(String[] args) {
        Point A = new Point();
        Point B = new Point();
        Point C = new Point();
        Triangle T = new Triangle(A, B, C);
        System.out.println("Point A: " + A);
        System.out.println("Point B: " + B);
        System.out.println("Point C: " + C);
        System.out.println("Le périmètre du triangle est : " + T.perimetre());
        T.estIsocele();
    }
}
