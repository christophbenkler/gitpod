public class Zeichen {
    public static void main(String[] args){

        System.out.println("Normaler Buchstabe, gefolgt von neuer Linie: " + 'a');
        System.out.print("So gibts... ");
        System.out.print("...keine neue Linie");
        System.out.println();
        
        System.out.println("Zeilenende für ...\n...Linux, Unix & macOS");
        System.out.println("         return" + '\r' + "Carriage");
        System.out.println("Windows-...\r\n...Zeilenende");
        System.out.println("Tabu-\tlator");
        System.out.println();
        
        System.out.println("Backslash muss mit einem Backslash escaped werden: " + '\\');
        System.out.println("Unicode-Zeichen < FFFF (16 bit): " + '\uFFE8' + " oder " + (char) 0xFFE8);
        System.out.println("Problem, falls > FFFF: " + (char) 0x1F60C);
        System.out.println("Lösung: " + Character.toString(0x1F60C) + " oder 😌");       

    }
}