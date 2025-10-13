
 class Triangle {
    private Point A;
    private Point B;   
    private Point C;
    public Triangle(Point A, Point B, Point C){
        this.A=A;
        this.B=B;
        this.C=C;   

    }
    public double perimetre(){
        return(A.distance(B)+B.distance(C)+C.distance(A));
    }
    



}
