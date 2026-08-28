class Solution {
    public int minSubArrayLen(int target, int[] nums) {
    //   int left =0;
    //   int right = 0;
    //   int sum =0;
    //  // int size = Integer.MAX_VALUE;
    //  int size = nums.length ;
    //   for (int i=right ;i<nums.length;i++){
    //     sum = sum+nums[i];
    //     while (sum >=target ){
    //        sum = sum-nums[left];
    //         size = Math.min(size , (right-left+1));
    //         left++;
    //     }
    //     right++;
    //   }  
    //   if (size ==nums.length){
    //     return 0 ;
    //   }
    //   return size;
    int left =0;
     int right = 0;
      int sum =0;
      int size = Integer.MAX_VALUE;
      for ( ; right <nums.length ;right ++){
        sum +=nums[right];
        while (sum>=target){
            sum = sum-nums[left];
            size = Math.min(size , (right-left)+1);
            left++;
        }
      }
    if (size == Integer.MAX_VALUE){
        return 0 ;
      }
      return size;
      
    }
}