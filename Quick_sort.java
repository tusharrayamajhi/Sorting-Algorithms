
public class Quick_sort {
    public static void Quicksort(int arr[],int si, int ei){
        if(si>=ei){
            return;
        }
        int i = Sort(arr,si,ei);
        Quicksort(arr, si, i-1);
        Quicksort(arr, i+1, ei);
    } 
    public static int Sort(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j = si;j<=arr.length-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr, i+1, ei);
        return i+1;
    }
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j] = temp;
    }
    public static void print(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] ={1,4,3,2,6,5,8,7,9,10};
        Quicksort(arr, 0, arr.length-1);
        print(arr);

    }
}