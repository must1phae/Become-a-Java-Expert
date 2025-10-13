
import java.util.Scanner;
public class Point {
    private double x;
    private double y;
    public Point(){
        
        Scanner p=new Scanner(System.in);
        System.out.println("donner la coordonnee x ");
        x=p.nextDouble();
        System.out.println("donner la coordonnee y");
        y=p.nextDouble();
    }
    public String toString(){
        return("Point("+x+","+y+")");
    }
    public double distance(Point P) {
        return Math.sqrt(Math.pow(this.x - P.x, 2) + Math.pow(this.y - P.y, 2));
    }   
    
 
}
