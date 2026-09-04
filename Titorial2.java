import java.util.Scanner;

public class Titorial2 {

    // L1: Check if a number is Prime (Using for loop)
    public static void checkPrime(Scanner scanner) {
        System.out.println("\n--- L1: Prime Number Checker ---");
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime number.");
        } else {
            System.out.println(number + " is not a Prime number.");
        }
    }

    // L2: Print right-angled triangle pattern
    public static void printTrianglePattern(Scanner scanner) {
        System.out.println("\n--- L2: Right-Angled Triangle Pattern ---");
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.println("The right-angled triangle pattern for " + rows + " rows is:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // L3: Check Palindrome (Using for loop instead of while)
    public static void checkPalindrome(Scanner scanner) {
        System.out.println("\n--- L3: Palindrome Checker ---");
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int origNumber = number;
        int reversedNumber = 0;

        // while(temp > 0) ko for loop se replace kiya
        for (int temp = Math.abs(number); temp > 0; temp /= 10) {
            int digit = temp % 10;
            reversedNumber = reversedNumber * 10 + digit;
        }

        if (origNumber >= 0 && reversedNumber == origNumber) {
            System.out.println(origNumber + " is a Palindrome.");
        } else {
            System.out.println(origNumber + " is not a Palindrome.");
        }
    }

    // L4: GCD using Euclidean Algorithm (Using for loop instead of while)
    public static void findGCD(Scanner scanner) {
        System.out.println("\n--- L4: Greatest Common Divisor (GCD) ---");
        System.out.print("Enter first number (number1): ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second number (number2): ");
        int number2 = scanner.nextInt();

        int n1 = Math.abs(number1);
        int n2 = Math.abs(number2);

       
        for (; n2 != 0; ) {
            int remainder = n1 % n2;
            n1 = n2;
            n2 = remainder;
        }

        System.out.println("The GCD of " + number1 + " and " + number2 + " is: " + n1);
    }

    // L5: Check Armstrong Number (Using for loop instead of while)
    public static void checkArmstrong(Scanner scanner) {
        System.out.println("\n--- L5: Armstrong Number Checker ---");
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int origNumber = number;
        int temp = Math.abs(number);

        
        int numDigits = 0;
        for (int countTemp = temp; countTemp > 0; countTemp /= 10) {
            numDigits++;
        }

        if (temp == 0) {
            numDigits = 1;
        }

        
        int sum = 0;
        for (int t = temp; t > 0; t /= 10) {
            int digit = t % 10;

            int power = 1;
            for (int i = 0; i < numDigits; i++) {
                power *= digit;
            }
            sum += power;
        }

        if (origNumber >= 0 && sum == origNumber) {
            System.out.println(origNumber + " is an Armstrong number.");
        } else {
            System.out.println(origNumber + " is not an Armstrong number.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        for (;;) {
            System.out.println("\n==========================================");
            System.out.println("  Category C Practice Problems - Menu");
            System.out.println("==========================================");
            System.out.println("1. L1 - Check Prime Number");
            System.out.println("2. L2 - Print Right-Angled Triangle");
            System.out.println("3. L3 - Check Palindrome Number");
            System.out.println("4. L4 - Find Greatest Common Divisor (GCD)");
            System.out.println("5. L5 - Check Armstrong Number");
            System.out.println("6. Run All (L1 to L5 sequentially)");
            System.out.println("7. Exit");
            System.out.print("Choose an option (1-7): ");

            int choice = scanner.nextInt();

            
            if (choice == 1) {
                checkPrime(scanner);
            } else if (choice == 2) {
                printTrianglePattern(scanner);
            } else if (choice == 3) {
                checkPalindrome(scanner);
            } else if (choice == 4) {
                findGCD(scanner);
            } else if (choice == 5) {
                checkArmstrong(scanner);
            } else if (choice == 6) {
                checkPrime(scanner);
                printTrianglePattern(scanner);
                checkPalindrome(scanner);
                findGCD(scanner);
                checkArmstrong(scanner);
            } else if (choice == 7) {
                System.out.println("Exiting program. Goodbye!");
                scanner.close();
                break; 
            } else {
                System.out.println("Invalid selection. Please choose a number from 1 to 7.");
            }
        }
    }
}
