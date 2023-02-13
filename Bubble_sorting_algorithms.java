/**
 * Bubble_sorting_algorithms
 */
public class Bubble_sorting_algorithms {
    public static void bubblesort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for(int j = 1; j < arr.length - i;j++){
                if(arr[j-1] > arr[j]){//if(arr[j-1]<arr[j]) for decsending order
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
            }
           
        }
    }
    public static void print(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 7, 5, 6 };
        bubblesort(arr);
        print(arr);

    }
}
