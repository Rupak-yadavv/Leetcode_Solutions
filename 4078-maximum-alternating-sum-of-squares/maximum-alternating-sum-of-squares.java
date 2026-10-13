class Solution {
    public long maxAlternatingSum(int[] nums) {
       long ans = 0;
       for (int i =0;i<nums.length;i++) {
        nums[i]= Math.abs(nums[i]);
       }
       Arrays.sort(nums);
       int  left=0;
       int right=nums.length-1;
       while(left<right){
        ans+=(Math.pow(nums[right],2));
        ans-=(Math.pow(nums[left], 2));
        left++;
        right--;
       }
       if (left==right)ans+=(Math.pow(nums[right],2));
       return ans ;
    }
}