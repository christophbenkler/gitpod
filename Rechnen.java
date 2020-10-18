public class Rechnen {
    public static void main(String[] args){

        int x = 3;
        int y = 4;
        
        System.out.println("x: " + x + "; y: " + y);
        System.out.println("==========");
            
        int add = x + y;
        System.out.println("Addition: " + add);
        
        int sub = x - y;
        System.out.println("Subtraktion: " + sub);
        
        int mul = x * y;
        System.out.println("Multiplikation: " + mul);
        
        int div = x / y;
        System.out.println("Division: " + div);
        
        int mod = x % y;
        System.out.println("Modulo: " + mod);
        
        double sqrt = Math.sqrt(y);
        System.out.println("Wurzel: " + sqrt);
        
        double pow = Math.pow(x,y);
        System.out.println("Potenzieren: " + pow);
        
        double e = 10e-5;
        System.out.println("Exponenzialschreibweise: " + e);
        
        int minus = -x;
        System.out.println("Minuszeichen: " + minus);
        
        System.out.println("Schön für Übersichtlichkeit: «_» in Zahlen werden ignoriert: " + 10_000_000);       

    }
}