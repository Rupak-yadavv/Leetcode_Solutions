class Solution {
    public int missingMultiple(int[] nums, int k) {
          int a =1;
       while (true){
       boolean b = false;
         int mul=k*a;
       for(int i=0 ;i<nums.length ;i++){
        if (mul==nums[i]){
            b =true;
            break;
         }
       } 
       if (!b){
        return mul;
       }
       a++;
       }       
    }
}