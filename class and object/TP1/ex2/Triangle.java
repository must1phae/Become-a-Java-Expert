
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
    public void estIsocele(){
        if(A.distance(B)==B.distance(C)||B.distance(C)==C.distance(A)||C.distance(A)==A.distance(B)){
            System.out.println("le triangle est isocèle");
        }
        else{
            System.out.println("le triangle n'est pas isocèle");
        }
    }

}
