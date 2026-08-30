class Solution {
    public int jump(int[] nums) {
        int n = nums.length ;
        int count = 0;
        int reach   =0;
         int current =0;
          for (int i =0 ;i<n-1 ; i++){
            reach  = Math.max(reach , i+nums[i] );
            if (current ==i){
                count++;
             current = reach ;
            }
          }
       return count ;
    }
}