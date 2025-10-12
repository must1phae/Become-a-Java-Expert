 class segment{
    double extr1;
    double extr2;
    
    public segment(double a, double b){
        extr1 = a;
        extr2 = b;
        ordonne();
    }
    public void ordonne(){
        if (extr1>extr2){
            double t=extr1;
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