class Solution {
    public boolean isGood(int[] nums) {
       int n = nums.length -1;
       boolean duplicate = false ;
       for (int num :nums){
        int val = Math.abs(num);
        if (val>n){
            return false ;
        }
        if (nums[val-1]<0){
            if (val<n || duplicate ){
                return false ;
            }
                duplicate =true;
                continue ;
            }
            nums[val-1]=-nums[val-1];
        }
        return true ;
       }
}