public class counting_sort {
    public static void CountingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int tem[] = new int[largest+1];
        for(int i = 0; i < arr.length; i++){
            tem[arr[i]]++;
        }
        //sorting
        int j =0;
        for(int i = 0; i<tem.length;i++){
           while(tem[i]>0){
            arr[j] = i;
            j++;
            tem[i]--;
           }
        }
        
    }
    public static void print(int arr[]){
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i]);
        }
            
        }
    public static void main(String[] args) {
        int arr[] = {2,4,1,7,4,1,2,8,9,8};
        CountingSort(arr);
        print(arr);
    }
}
