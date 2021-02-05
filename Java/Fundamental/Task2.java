import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name: ");
        String enterName = read.readLine();
        String reverseString = new StringBuffer(enterName).reverse().toString();
        System.out.println("\nString before reverse: " + enterName);
        System.out.println("String after reverse: " + reverseString);
    }
}
