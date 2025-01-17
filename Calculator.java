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
        System.out.println();
    }
}