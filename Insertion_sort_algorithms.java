public class Insertion_sort_algorithms {
    public static void Insertion_sort(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int curr = arr[i];
            int pre = i-1;
            //finding the correct position
            while(pre >= 0 && arr[pre] > curr){
                arr[pre + 1] = arr[pre];
                pre--;
            }
            arr[pre+1] = curr;
        }
         
    }
    public static void print(int arr[]){
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,1,3,8,5,9,7};
        Insertion_sort(arr);
        print(arr);
    }
}
