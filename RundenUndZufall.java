public class RundenUndZufall {
    public static void main(String[] args){

        // «Zufälliger» double zwischen 0 und 1:
        double random = Math.random();

        // Runden auf zwei Nachkommastellen:
        System.out.println(Math.round(random*100)/100.0);       

    }
}