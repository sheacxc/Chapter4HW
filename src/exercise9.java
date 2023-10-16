import java.util.Scanner;
public class exercise9 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter String: ");
        String str= input.nextLine();
        System.out.println("Enter character to search in string: ");
        char ch= input.next().charAt(0);

        int last=-1;

        for(int i=0; i<str.length(); i++) {
            if (str.charAt(i) == ch)
                last = i;
        }

        System.out.println("The last occurrence of '" + ch + "' in " + "\"" + str + "\"" + " is at index " + last);
    }
}