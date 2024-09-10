// public class Javaimport {
//     public static void main(String[] args){
//         int n = 4;
//         for(int i =1;i<=n;i++){
//             for(int j =1;j<=n-i;j++){
//                 System.out.print("");
//             }
//             // upper half
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();

//         }

//         for(int i =n;i>=1;i--){
//             for(int j =1;j<=n-i;j++){
//                 System.out.print("");
//             }
//             // upper half
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*" + "");
//             }
//             System.out.println();

//         }

//     }
// }    

public class Javaimport {

    public static void main(String[] args) {
        int n = 5; // size of the butterfly (change this to increase or decrease the size)

        // // Upper part of the butterfly
        // for (int i = 1; i <= n; i++) {
        //     // Left part of the butterfly
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     // Spaces in the middle
        //     for (int j = 1; j <= 2 * (n - i); j++) {
        //         System.out.print(" ");
        //     }
        //     // Right part of the butterfly
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // Lower part of the butterfly
        // for (int i = n; i >= 1; i--) {
        //     // Left part of the butterfly
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     // Spaces in the middle
        //     for (int j = 1; j <= 2 * (n - i); j++) {
        //         System.out.print(" ");
        //     }
        //     // Right part of the butterfly
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=(n-i);j++){
        //         System.out.print("");
        //     }
        //     for(int j=1;j<=5;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
      
                // Upper part of the butterfly
        for (int i = 1; i <= n; i++) {
                    // Left side of the butterfly
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                        System.out.print(" ");
                }
            }
                    // Space between the wings
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
                    // Right side of the butterfly
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
                // Lower part of the butterfly
        for (int i = n; i >= 1; i--) {
                    // Left side of the butterfly
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                     System.out.print(" ");
                }
            }
                    // Space between the wings
            for (int j = 1; j <= 2 * (n - i); j++) {
                        System.out.print(" ");
            }
                    // Right side of the butterfly
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
         
        
    }
}
