public class PracticeQuicSort {
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j = low;j<high;j++){
            if(arr[j]<pivot){
                i++;

                int temp = arr[i];
                arr[i]= arr[j];
                arr[j] = temp;
    
            }

           
           
        }
           //for print pivot element
           i++;
           int temp = arr[i];
           arr[i] = pivot;
           arr[high] = temp;
           return i;
      

    }
    public static void quickSorts(int arr[], int low,int high){
        if(low<high){
            int pidx = partition(arr, low, high);
            quickSorts(arr, low, pidx-1);
            quickSorts(arr, pidx+1, high);

        }
      
    }
    public static void main(String[] args){
        int arr[] = {7,8,3,2,9,6};
        int n = arr.length;
        quickSorts(arr, 0, n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

    }
    
}
