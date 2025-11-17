    import java.util.Scanner;
    class segment{
     private int extr1;
     private int extr2;
    
    public segment(){
        Scanner sc= new Scanner(System.in);
        System.out.println("donner le  1er extremite");
        extr1=sc.nextInt();
        System.out.println("donner le  2eme extremite");
        extr2=sc.nextInt();
        ordonne();
        sc.close();
    
    }
    public void ordonne(){
        if (extr1>extr2){
            int t=extr1;
            extr1=extr2;
            extr2=t;
        }
    }
    public double getLongueur(){
        return(extr2-extr1);
    }
    public boolean appartient(double x){
        return((x>=extr1) && (x<=extr2));
    }
    public String toString(){
        return("segment["+extr1+","+extr2+"]");
    }
    



}