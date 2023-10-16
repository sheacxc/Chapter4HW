import java.util.Scanner;
public class exercise7 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter string #1");
        String string1= input.nextLine();

        System.out.println("Enter string #2");
        String string2= input.nextLine();

        if(string1.length() > string2.length()) {
            System.out.println("string " + "\"" + string1 + "\"" + " is larger then " + " string " + "\"" + string2 + "\"");
        } else {
            System.out.println("string " + "\"" + string1 + "\"" + " is not larger then string " + "\"" + string2 + "\"");
        }

        if (string1.compareTo(string2) < 0) {
            System.out.println(string1 + " comes before " + string2);
        } else if (string1.compareTo(string2) == 0) {
            System.out.println(string1 + " is equal to " + string2);
        } else {
            System.out.println(string1 + " comes after " + string2);
        }

        System.out.println(string1 + " " + string2);
    }
}