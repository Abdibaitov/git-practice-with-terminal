import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("This is number is chetnyi");
        }
        else {
            System.out.println("This is number is nechetnyi");
        }
    }
}