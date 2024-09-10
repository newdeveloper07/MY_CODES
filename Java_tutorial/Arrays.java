import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       int rows = sc.nextInt();
       int colos = sc.nextInt();

       int numbers[][] = new int[rows][colos];

       for(int i =0;i<rows;i++){
        for(int j=0;j<colos;j++){

            numbers[i][j] = sc.nextInt();
        }
       }

       System.out.println("the transpose of matrix is:");

       for(int j=0;j<colos;j++){
        for(int i=0;i<rows;i++){
            System.out.print(numbers[i][j]);
        }
        System.out.println();
       }
    }   
}