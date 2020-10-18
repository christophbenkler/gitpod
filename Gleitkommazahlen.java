public class Gleitkommazahlen {
    public static void main(String[] args){

        double x = 0.1 + 0.1 + 0.1;
        System.out.println(x == 0.3); // false
        System.out.println(Double.compare(x, 0.3)); // 1/-1

    }
}