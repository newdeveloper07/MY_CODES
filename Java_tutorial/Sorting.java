
import java.util.Scanner;

// public class Sorting {
//     public static void printArray(int arr[]){
//         for(int i =0;i<arr.length-1;i++){
//             System.out.print(arr[i]);
//         }
//         System.out.println();

//     }
//     public static void main(String[] args){
//         int arr[] = {7,8,3,1,2};


//         for(int i =0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int swap = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = swap;
//                 }
//             }
//         }
//         printArray(arr);
//     }
    
// }

public class Sorting{
   
    public static void printArray(int arr[],int size){
        for(int i =0;i<size ;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args){
        int  size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the arrays elements");

        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();

        }
        for(int i =0;i<size-1;i++){
            for(int j =0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;

                }
            }
        }
        printArray(arr, size);
    } 
}
