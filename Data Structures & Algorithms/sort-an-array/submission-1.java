class Solution {
    

    public static void merge(int[] nums, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i=0;i<n1;i++){
            L[i] = nums[left+i];
        }

        for(int j=0;j<n2;j++){
            R[j] = nums[mid+1+j];
        }

        int i=0,j=0,k=left;
        while(i<n1 && j<n2){
            if(L[i] < R[j]){
                nums[k] = L[i];
                i++;
            }
            else{
                nums[k] = R[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            nums[k] = L[i];
            i++;
            k++;
        }
        while(j<n2){
            nums[k] = R[j];
            j++;
            k++;
        }

    }
    public static void sort(int[] nums, int left, int right){
        if(left<right){
        int mid = left + (right-left) / 2;
        sort(nums, left, mid);
        sort(nums, mid+1, right);

        merge(nums, left, mid, right);
        }
    }
    public int[] sortArray(int[] nums) {
        int n = nums.length;

        //Selection_sort 
        // for(int i=0;i<nums.length-1;i++){
        //     int min = i;
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[j] < nums[min]){ 
        //             min = j;
        //         }
        //     }
        //     int temp = nums[i];
        //     nums[i] = nums[min];
        //     nums[min]= temp;
        // }

        // bubble_sort
    
        // for(int i=0;i<n-1;i++){
        //     for(int j=0;j<n-i-1;j++){
        //         if(nums[j] > nums[j+1]){
        //             int temp = nums[j];
        //             nums[j] = nums[j+1];
        //             nums[j+1] = temp;
        //         }
        //     }
        // } 
        
        //
        sort(nums, 0, n-1);
      return nums;

    }
   
}