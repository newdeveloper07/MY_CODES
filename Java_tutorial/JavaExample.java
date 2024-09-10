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
// import javax.sql.rowset.spi.SyncFactory;

public class JavaExample {
    public static void main(String[] args) {

        // Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        // int num = scanner.nextInt();
        // if(num==1){
        //     int marks = 90;
        //     do{
        //         System.out.println("This is good");
        //         marks++;
        //     }while(marks<100);
        // }
        // if(num==0){
        //     System.out.println("stop");
        // }
        // System.out.println("Enter the value of n:");
        // int n = scanner.nextInt();
        // int sum = 0;
        // for(int i =1; i<=n; i++){
            
        //     sum = sum + i;
        
        // }
        // System.out.println(sum);
        
        // System.out.println("enter your age");
        // int age = scanner.nextInt();
        // System.out.println(age);
        // System.out.println("Enter the radius");
        // float radius = scanner.nextFloat();
        // double pi = 3.14,area;
        // area = 3.14*radius*radius;
        // System.out.println("area of circle is" +area);
        // System.out.println("Enter the value of n");
        // int n = scanner.nextInt();

        // if(n%2==0){
        //     System.out.println("EVEN");
        // }else{
        //     System.out.println("odd");
        // }
        // int a = scanner.nextInt();
        // int b = scanner.nextInt();
        // int add = a + b;
        // int sub = a - b;
        // int mul = a * b;
        // int div = a/b;
        // int mod = a % b;
        // System.out.println("additon of a and b:" + add);
        // System.out.println("subtraction of a and b:" + sub);
        // System.out.println("multification of a and b:" + mul);
        // System.out.println("division of a and b:" + div);
        // System.out.println("modulus of a and b:" + mod);

        // int month = scanner.nextInt();
        // switch(month){
        //     case 1: System.out.println("january");
        //     break;
        //     case 2: System.out.println("february");
        //     break;
        //     case 3: System.out.println("march");
        //     break;
        //     case 4: System.out.println("april");
        //     break;
        //     case 5: System.out.println("may");
        //     break;
        //     case 6: System.out.println("june");
        //     break;
        //     case 7: System.out.println("july");
        //     break;
        //     case 8: System.out.println("august");
        //     break;
        //     case 9: System.out.println("september");
        //     break;
        //     case 10: System.out.println("october");
        //     break;
        //     case 11: System.out.println("november");
        //     break;
        //     case 12: System.out.println("december");
        //     break;
        //    default: System.out.println("invalid");
        // String fruit = scanner.nextLine();
        // int num = scanner.nextInt();
        // switch(num) {
        //     case 1->System.out.println("queen of fruit");
        //     case 2->System.out.println("king of fruit");
        //     case 3->{
        //         System.out.println("sweet fruit");
        //         switch(fruit) {
        //             case "mango"->System.out.println("best fruit");
        //             case "apple"->System.out.println("good fruit");
        //             default->System.out.println("no fruit");
        //         }


        //     }
        //     default->System.out.println("none");
        // int n  = 4;
        // int m = 5;
        // NESTED LOOP
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=m;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        // hollow rectangle
        // for(int i =1;i<=n;i++){
        //     for(int j=1;j<=m;j++){
        //         if(i==1 || j==1 || i==n|| j==m){
        //             System.out.print("*");
        //         }else{
        //             System.out.print("");
        //         }
        //     }
        //     System.out.println();
        // }

        // half pyramid

        // for(int i =1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i =n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // inverted and rotated half pyramid
        // for(int i=1;i<=n;i++){
        //     // space loop
        //     for(int j=1;j<=n-1;j++){
        //         System.out.print("");

        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.err.println();
        // }

        // int n =5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-1;j++){
        //         System.out.print("");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);

        //     }
        //     System.out.println();
        // }

        
        // for(int i =n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+"");
        //     }
        //     System.out.println();
        // }
        // other method to print reverse pyramid

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i+1;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // floyd's triangle

        // int n=5;
        // int number = 1;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(number + "");
        //         number++;
        //     }
        //     System.out.println();
        // }

        // int n =5;
        
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         int sum = i+j;
        //         if(sum % 2 == 0){
        //             System.out.print("1");
        //         }else{
        //             System.out.print("0");
        //         }
            
        //     }
        //     System.out.println();
        // }

        // int n =5;
        // // upper half
        // for(int i =1;i<=n;i++){
        //     // first half
        //     for(int j =1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     // int spaces = 2 * (n-i);
        //     for(int j =1;j<=2*(n-i);j++){
        //         System.out.print("");
        //     }
        //     // 2ND HALF
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();



        
        // }
        // for(int i =n;i>=1;i--){
        //     // first half
        //     for(int j =1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     // int spaces = 2*(n-i);
        //     for(int j =1;j<=2*(n-i);j++){
        //         System.out.print("");
        //     }
        //     // 2ND HALF
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }    
        // int n = 5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print("");
        //     }
        //     for(int j=1;j<=5;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int n = 5;
        // for(int i=1;i<=n;i++){
        //     for(int j =1;j<=n-i;j++){
        //         System.out.print("");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i + "");
        //     }
        //     System.out.println();
        // }


        // int n = 4;
        // for(int i =1;i<=n;i++){
        //     for(int j =1;j<=n-i;j++){
        //         System.out.print("");
        //     }
        //     // upper half
        //     for(int j=1;j<=2*i-1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

        // }

        // for(int i =n;i>=1;i--){
        //     for(int j =1;j<=n-i;j++){
        //         System.out.print("");
        //     }
        //     // upper half
        //     for(int j=1;j<=2*i-1;j++){
        //         System.out.print("*" + "");
        //     }
        //     System.out.println();

        // }

        

           
                int n = 5; // size of the butterfly (change this to increase or decrease the size)
        
                // Upper part of the butterfly
                for (int i = 1; i <= n; i++) {
                    // Left part of the butterfly
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    // Spaces in the middle
                    for (int j = 1; j <= 2 * (n - i); j++) {
                        System.out.print(" ");
                    }
                    // Right part of the butterfly
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
        
                // Lower part of the butterfly
                for (int i = n; i >= 1; i--) {
                    // Left part of the butterfly
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    // Spaces in the middle
                    for (int j = 1; j <= 2 * (n - i); j++) {
                        System.out.print(" ");
                    }
                    // Right part of the butterfly
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            
        
        







            



            

    }
        // }





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

