import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of the minimum range: ");
        int minRange = Integer.parseInt(read.readLine());
        System.out.println("Enter the number of the maximum range: ");
        int maxRange = Integer.parseInt(read.readLine());
        System.out.println("Enter the number of the random numbers: ");
        int numberOfRandomNumbers = Integer.parseInt(read.readLine());
        int numberOfRandomNumbersForOneString = numberOfRandomNumbers;


        while (numberOfRandomNumbers>0) {
            int randomNumber = (int) (minRange * Math.random() * maxRange);
            System.out.println("Generated number: " + randomNumber);
            numberOfRandomNumbers--;
        }

        int countNumber = 1;
        while (numberOfRandomNumbersForOneString>0) {
            int randomNumber = (int) (minRange * Math.random() * maxRange);
            System.out.print(" Number:" + "(" + countNumber + ")"+ " " + randomNumber);
            numberOfRandomNumbersForOneString--;
            countNumber++;
        }

    }
}
