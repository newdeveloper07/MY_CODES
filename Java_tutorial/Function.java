import java.util.*;
// public class Function {
//     public static void printMyName(String name){
//         System.out.println(name);
//         return;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();

//         printMyName(name);
         
//     }
    
// }

public class Function{
    // public static int printSum(int a, int b){
    //     int sum = a + b;
    //     System.out.println(sum);
    //     return sum;
        
    // }
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     int sum = printSum(a, b);
    //     System.out.println("sum of 2 num is:" +sum);

        
    // }
    // public static int calculateMul (int a, int b){
    //     int mul = a*b;
    //     return mul;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int mul = calculateMul(a, b);

    //     System.out.println("multification of 2 numbers is:" +mul);
    // }

    // public static void printFactorial(int n){

    //     if(n<0){
    //         System.out.println("invalid");
    //         return;
    //     }
    //     int factorial =1;
    //     for(int i=n;i>=1;i--){
    //         factorial = factorial*i;

    //     }
    //     System.out.println(factorial);
    
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     printFactorial(n);
    // }

    // public static void isPrime(int n){
    //     boolean isPrimes = true;
    //     for(int i=2;i<=n/2;i++){
    //         if(n%2==0){
    //             isPrimes = false;
                
    //         }

    //     }
    //     if(isPrimes){
    //         if(n==1){
    //             System.out.println("not");
    //         }else{
    //             System.out.println("is prime");
    //         }
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n =sc.nextInt();
    //     isPrime(n);
    // }

    // public static void findEvenOdd(int n){
    //     if(n%2==0){
    //         System.out.println("even");
    //     }
    //     else{
    //         System.out.println("odd");
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     findEvenOdd(n);
    // }

    // public static void findAvg(int a,int b,int c){
    //     int sum = a + b + c;
    //     int avg = sum/3;
    //     System.out.println("average of three numberss are:" +avg);


    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int c = sc.nextInt();
    //     findAvg(a, b, c);

    // }

    // public static void OddSum(int n){
    //     int sum = 0,i;
        
        
    //     for(i=1;i<=n;i++){
    //         if(i%2!=0){
    //             System.out.println(i);
    //             sum = sum +i;
    //         }
            

    //     }
    //     System.out.println(sum);
       
        
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     OddSum(n);
        
    // }

    // public static void GreatestNum(int a ,int b){
    //     if(a>b){
    //         System.out.println("a is greater than b");
    //     }else{
    //         System.out.println("b is greater than a");
    //     }

    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     GreatestNum(a, b);
    // }

    public static void AgeFun(int age){
        if(age>=18){
            System.out.println("they can vote");
        }else{
            System.out.println("they can't vote");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        AgeFun(age);

    }
}
