class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans =0;
        long count =0;
        for (int i =0;i<nums.length ;i++){
           if (minK<=nums[i]&& nums[i]<=maxK){
            count++;
            ans+=count;
           }else count=0;
        }
        return ans;
    }
}