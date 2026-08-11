class Solution {
    public int findMin(int[] nums) {
        int left= 0; 
        int right = nums.length-1;
        int p = nums[right];
        
        while (left<=right){
            int mid = left+(right-left)/2;
            if (nums[right]>nums[mid]){
                right = mid ;
                p = nums[right];
            }
            else {
                left = mid+1;
            }
        }
        return p ;
    }
}