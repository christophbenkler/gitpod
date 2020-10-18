public class BinOctDecHex {
    public static void main(String[] args){

        Integer dec = 9000;
        System.out.println(Integer.toBinaryString(dec));
        System.out.println(Integer.toOctalString(dec));
        System.out.println(Integer.toHexString(dec));
        
        int bin = 0b10001100101000; // Binär-Zahlen beginnen mit 0b
        int oct = 021450; // Oktal-Zahlen beginnen mit 0
        int hex = 0x2328; // Hexadezimal-Zahlen beginnen mit 0x
        
        System.out.println(oct + " " + hex + " " + bin);       

    }
}