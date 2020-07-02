package codersbay.ben;

public class Main {

    public static void main(String[] args) {

        /*
        System.out.println();
        System.out.println();

        System.out.println("TODO: Add text, return text, show length");
        EasyString easyString1 = new EasyString();
        easyString1.add(" She sells sea shells down by the sea shore. ");
        System.out.println(easyString1.toString());
        System.out.println("length: " + easyString1.length() + " characters");

        System.out.println();
        System.out.println();

        System.out.println("TODO: Add text, return text, shorten text, show length");
        EasyString easyString2 = new EasyString("10987654321");
        System.out.println(easyString2.toString());
        System.out.println("length: " + easyString2.length() + " characters");
        easyString2.remove(5);
        System.out.println(easyString2.toString());
        System.out.println("length: " + easyString2.length() + " characters");

        System.out.println();
        System.out.println();

        System.out.println("TODO: Add text, return text, trim middle, show length");
        EasyString easyString3 = new EasyString(" down by the sea shore ");
        System.out.println(easyString3.toString());
        System.out.println("length: " + easyString3.length() + " characters");
        easyString3.trimMiddle();
        System.out.println(easyString3.toString());

        System.out.println();
        System.out.println();

        System.out.println("TODO: Add text, return text, trim back, show length");
        EasyString easyString4 = new EasyString(" Good smells smell good ");
        System.out.println(easyString4.toString());
        System.out.println("length: " + easyString4.length() + " characters");
        easyString3.trimFront();
        System.out.println(easyString4.toString());
        */


        EasyString easyString5 = new EasyString(" Good smells smell good ");
        easyString5.remove(5);
        System.out.println(easyString5.toString());
        System.out.println(easyString5.length());
        easyString5.trimFront();
        System.out.println(easyString5.toString());

        System.out.println();
        System.out.println();


        EasyString easyString6 = new EasyString(" Hallo Welt          ");
        System.out.println(easyString6.toString());
        System.out.println(easyString6.length());
        //easyString6.remove(6);
        //System.out.println(easyString6.toString());
        //System.out.println(easyString6.length());
        //easyString6.trimFront();
        //System.out.println(easyString6.toString());
        //System.out.println(easyString6.length());
        //easyString6.trimFront();
        //easyString6.trimBack();
        easyString6.trimMiddle();
        System.out.println();
        System.out.println(easyString6.toString());
        System.out.println(easyString6.length());


    }
}
