import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        System.out.println("Your age is: " + age);
    }
}