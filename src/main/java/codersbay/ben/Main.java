package codersbay.ben;

public class Main {

    public static void main(String[] args) {

        EasyString easyString1 = new EasyString();
        easyString1.add("She sells sea shells down by the sea shore.");
        System.out.println(easyString1.toString());
        System.out.println(easyString1.length());
        easyString1.remove(5);
        System.out.println(easyString1.toString());
        System.out.println(easyString1.length());

        /*
        System.out.println();
        EasyString easyString2 = new EasyString();
        easyString2.add("shore");
        System.out.println(easyString2.toString());
        System.out.println(easyString2.length());

         */


    }
}
