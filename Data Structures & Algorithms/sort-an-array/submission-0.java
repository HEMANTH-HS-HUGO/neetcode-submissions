class Solution {
     public static void mergeSort(int[] arr, int l, int h){
        if(l<h){
        int mid = (l+h)/2;

        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,h);

        merge(arr,l,mid,h);
        }
    }

    public static void merge(int[] arr,int l, int mid, int h){
        int n1 = mid-l+1;
        int n2 = h-mid;

        int larr[] = new int[n1];
        int rarr[] = new int[n2];

        
        for(int x=0;x<n1;x++){
            larr[x] = arr[l+x];
        }

        for(int x=0;x<n2;x++){
            rarr[x] = arr[mid+1+x];
        }

        int i=0;
        int j=0;
        int k=l;

        while(i<n1 && j<n2){
            if(larr[i]<=rarr[j]){
                arr[k] = larr[i];
                i++;
            }
            else{
                arr[k] = rarr[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k] = larr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = rarr[j];
            j++;
            k++;
        }
    }
    public int[] sortArray(int[] arr) {
        //merge sort takes O(nlogn)
        mergeSort(arr,0,arr.length-1);
        return arr;

    } 
}