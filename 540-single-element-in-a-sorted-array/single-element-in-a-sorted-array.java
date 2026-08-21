class Solution {
    public int singleNonDuplicate(int[] nums) {
        int right = nums.length-1;
        if (nums.length<2){
            return nums[0];
        }
       /* while (left <right){
            int mid = left+(right -left)/2;
            if (nums[left])
        }*/
        for (int i=0;i<nums.length-1;i+=2){
            if (nums[i]==nums[i+1]){
                continue ;
            }
           return nums[i];
        }
        return nums[nums.length-1];
    }
}