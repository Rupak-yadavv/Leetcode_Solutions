class Solution {
    public int missingInteger(int[] nums) {
       boolean b = true ;
       int sum =nums[0];
       int j =0;
     for (int i =1;i<nums.length;i++){
        if (nums[i]==nums[i-1]+1){
            sum+=nums[i];
        }else{
        break ;
        }
      } 
        for (int i =0;i<nums.length ;i++){
            if (sum==nums[i]){
                sum =sum+1;
                i=-1;
            }
        }
           return sum ;
       }
}