import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many number you want to insert ? ");
        int quantityNumbers = scanner.nextInt();
        System.out.println("Enter number: ");
        int total = 0;
        int interfaceNumber = 1;


        for (int i = 0; i < quantityNumbers; i++,interfaceNumber++) {
            System.out.print(interfaceNumber + ". - ");
            int enterNumber = scanner.nextInt();
            total+= enterNumber;
        }
        System.out.println("Total: " + total);
    }
}
