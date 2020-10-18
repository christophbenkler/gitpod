public class Typumwandlung {

    public static void main(String[] args){

        int i = 3093;
        System.out.println("int i: " + i);
        
        byte b = (byte) i;
        System.out.println("byte b: " + b);
        
        char c = (char) 64;
        System.out.println("char c: " + c);
        
        Integer zahl = Integer.valueOf("42");
        System.out.println("Integer Zahl: " + zahl);       

    }
}