class Solution {
    public int dominantIndex(int[] nums) {
       int max = 0;
       int maxIndex=0;
      for (int i =0;i<nums.length ;i++){
      if (max <nums[i]){
        max = nums[i];
        maxIndex = i;
      }
      }
      for (int num :nums){
        if (num!=max && max<2*num) return -1;
      }
      return maxIndex ;
    }
}