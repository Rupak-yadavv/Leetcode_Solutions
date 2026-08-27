class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int mid = (nums.length-1)/2;
        int count =0;
        for (int i =0;i<nums.length;i++){
            if (nums[mid]==nums[i]){
                count++;
            }
        }
        if (count>1){
            return false ;
        }
        return true ;
    }
}