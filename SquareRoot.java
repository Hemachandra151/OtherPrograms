// Positive square Root of a positive real number

public class Main{
    public static void main (String[] args) {
        double n = 225;
        
        double x = sqrt(n);
        
        System.out.println("Square Root of "+n+" is "+x);
    }
    
    public static double sqrt(double n){
        double x = 1;
        
        for(int i=0;i<20;i++)
        {
            x = x - (x*x - n)/(2*x);
        }
        return x;
    }
}