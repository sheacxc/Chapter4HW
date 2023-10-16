import java.util.Scanner;
public class exercise8 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter your input: ");
        String sent= input.nextLine();
        StringBuilder x= new StringBuilder(sent);
        x.reverse();
        String output = x.toString();
        System.out.println("\"" + sent + "\"" + " backwards is " + "\"" + output + "\"");
    }

}