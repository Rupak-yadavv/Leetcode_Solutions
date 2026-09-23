class Solution {
    public int minOperations(int[] nums, int x) {
        int total =0;
        for (int num : nums){
            total+=num;
        }
        int target =total-x;
        if (target ==0){
            return nums.length ;
        }
        int left =0;
        int sum =0;
        int max = -1;
        for (int right =0;right <nums.length ;right ++){
            sum+=nums[right];
            while (left<=right && sum>target){
                sum-=nums[left];
                left ++;
            }
            if (sum==target){
            max = Math.max (max , right-left+1);
              }
        }
        if (max ==-1){
            return -1;
        }else
        return nums.length -max;
    }
}