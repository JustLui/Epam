import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name: ");
        String enterName = read.readLine();
        System.out.println("Welcome to EPAM courses: " + enterName);
    }
}
