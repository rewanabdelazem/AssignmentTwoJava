import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept number input from the user
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();
        PrimeNumberChecker num = new PrimeNumberChecker(userInput);
        boolean isPrime = num.IsPrime();
        if(isPrime){
            System.out.println(userInput + " is prime number.");
        }
        else{
            System.out.println(userInput + " is not prime number.");
        }
    }
}