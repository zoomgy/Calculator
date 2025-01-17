import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Calculator");
        System.out.print("Enter the First Number --> ");
        int first = sc.nextInt();
        System.out.print("Enter the Second Number --> ");
        int second = sc.nextInt();
        System.out.println("1.Addition    ");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication    ");
        System.out.println("4.Division");
        System.out.print("Enter Your Choice of Operation (Number) --> ");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.print("Added Numbers are --> ");
            System.out.println(first + second);
        } else if (choice == 2) {
            System.out.print("Substraction --> ");
            System.out.println(first - second);
        } else if (choice == 3) {
            System.out.print("Division --> ");
            System.out.println(first / second);
        } else if (choice == 4) {
            System.out.print("Multiplication --> ");
            System.out.println(first * second);
        } else {
            System.out.println("Irrelevant choice.");
        }

        System.out.println();
    }
}