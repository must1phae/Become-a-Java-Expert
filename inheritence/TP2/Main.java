public class Main {
    public static void main(String[] args) {
        employe e1 = new employe("Doe", "John", 3000);
        manager m1 = new manager("Smith", "Jane", 5000, 1500);
        
        e1.afficher();
        m1.afficher();
    }
    
}
