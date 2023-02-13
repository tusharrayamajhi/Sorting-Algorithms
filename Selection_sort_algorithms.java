public class Selection_sort_algorithms {
    public static void Selection_sort(int arr[]){
        for(int i = 0;i < arr.length-1;i++){
            int mintom = i;
            for(int j = i+1; j < arr.length-1;j++){
                if(arr[i]>arr[j]){//if(arr[i]<arr[j]) for decsending order
                    mintom = j;
                }
            }
            int temp = arr[mintom];
            arr[mintom] = arr[i];
            arr[i] = temp;
        }
    }
    public static void Print(int arr[]){
        for(int i = 0; i<arr.length-1;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,6,2,4,9,5};
        Selection_sort(arr);
        Print(arr);
    }
}
