public class Merge_sort {
    public static void merge2(int arr[], int si,int mid,int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;

        }
        while(i <= mid){
            temp[k] = arr[i];
            i++;
            k++;
        }
        while(j <= ei){
            temp[k] = arr[j];
            k++;
            j++;
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }
    public static void Merge(int arr[],int l,int r){
        if(l>=r){
            return;
        }
        int mid = l+(r-l)/2;
        //right
        Merge(arr,l,mid);
        //left
        Merge(arr,mid+1,r);
        merge2(arr,l,mid,r);
    }
    public static void print(int arr[]){
        for(int i = 0; i< arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,2,5,7,6,3,8,0,9};
        Merge(arr,0,arr.length-1);
        print(arr);
    }
}
