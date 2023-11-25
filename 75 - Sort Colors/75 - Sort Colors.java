class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int mid = 0;
        while(mid <= high){
        switch(nums[mid]){
            case 0:
                swap(nums,mid,low);
                low++;
                mid++;
                break;
            case 1:
                mid++;
                break;
            case 2:
                swap(nums,mid,high);
                high--;
                break;
            default:
                break;
        }
            
        }
    }
    public static void swap(int [] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
