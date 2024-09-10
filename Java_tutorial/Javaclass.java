// public class JavaExample {
//   public static void main(String[] args) {
//     // two integer variables with values
//     // and a variable "sum" to store the result
//     int num1 = 5, num2 = 15,sum;

//     //calculating the sum of num1 and num2 and
//     //storing the result in the variable sum
//     sum = num1+num2;

//     //printing the result
//     System.out.println("Sum of "+num1+" and "+num2+" is: "+sum);
//   }
// }

// import java.util.Scanner;  // Import the Scanner class

// class JavaExample {
//   public static void main(String[] args) {
//     Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//     System.out.println("Enter username");

//     String userName = myObj.nextLine();  // Read user input
//     System.out.println("Username is: " + userName);  // Output user input
//   }
// }

import java.util.Scanner;  // Import the Scanner class

public class Javaclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        
        System.out.println("enter your age");
        int age = scanner.nextInt();
        System.out.println(age);

        // Prompt the user to enter the first number
        // System.out.println("Enter the first number:");
        // int num1 = scanner.nextInt();  // Read the first number

        // // Prompt the user to enter the second number
        // System.out.println("Enter the second number:");
        // int num2 = scanner.nextInt();  // Read the second number

        // // Calculate the sum of the two numbers
        // int sum = num1 + num2;


        // // Display the sum
        // System.out.println("The sum of the two numbers is: " + sum);
    }
}
