import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        /*
        String lang= "ur";
        String country= "PK";

        Locale locale = new Locale(lang, country);
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", locale);
        String message = rb.getString("wish");

        System.out.println(message);
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Select a language");
        System.out.println("1. English");
        System.out.println("2. Finnish");
        System.out.println("3. Urdu");
        System.out.println("4. Vietnamese");
        int choice = input.nextInt();
        Locale locale;
        switch (choice) {
            case 1:
                locale = new Locale("en", "US");
                break;
            case 2:
                locale = new Locale("fi", "FI");
                break;
            case 3:
                locale = new Locale("ur", "PK");
                break;
            case 4:
                locale = new Locale("vn", "VN");
                break;
            default:
                System.out.println("Invalid choice, defaulting to English");
                locale = new Locale("en", "US");
        }
        ResourceBundle rb = ResourceBundle.getBundle("MessagesBundle", locale);
        String message = rb.getString("wish");
        System.out.println(message);

        System.out.println(rb.getString("prompt1"));
        double a = input.nextDouble();
        System.out.println(rb.getString("prompt2"));
        double b = input.nextDouble();
        double sum = addMe(a, b);
        double sub = subMe(a, b);
        System.out.println(rb.getString("summ")+" "+ sum);
        System.out.println(rb.getString("subtract")+" "+ sub);
    }

    public static double addMe(double a, double b) {
        return a + b;
    }
    public static double subMe(double a, double b) {
        return a - b;
    }
}
