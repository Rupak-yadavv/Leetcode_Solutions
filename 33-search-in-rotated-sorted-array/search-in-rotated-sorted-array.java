class Solution {
    static int bs(int[] nums, int target , int left , int right ) {
        while (left<=right){
            int mid = left +(right-left)/2;
            if (nums[mid]==target){
              return mid ;
            }
        else if (nums[mid]>target ){
            right= mid -1;
        }
        else {
            left= mid +1;
        }
        }
        return -1;
    }
    static int min(int [] nums){
        int left = 0;
        int right = nums.length-1;
        int ans =-1;
         while (left<right){
            int mid = left +(right-left)/2;
            if (nums[right]>nums[mid]){
                ans = mid;
                right = mid;
            }
            else {
            left = mid+1;
            }
     }
     return left;
    }
     public int search(int [] nums , int target ){
        int pivot =min(nums);
        int ans1 = bs(nums , target ,0 , pivot-1);
    
        if (ans1!=-1)
        return ans1;
          return   bs(nums , target , pivot , nums.length-1);
}
}