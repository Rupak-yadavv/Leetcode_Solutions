class Solution {
    public int findMiddleIndex(int[] nums) {
      int total =0;
      for (int ele: nums){
        total+=ele;
      }
      int leftsum=0;
      for (int i =0;i<nums.length ;i++){
        int rightsum=total-nums[i]-leftsum;
        if (leftsum==rightsum){
            return i ;
        }
        leftsum+=nums[i];
      }
      return -1;
    }
}