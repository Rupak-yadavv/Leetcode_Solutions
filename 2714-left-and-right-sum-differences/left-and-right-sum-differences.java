class Solution {
    public int[] leftRightDifference(int[] nums) {

        //its time complexity is O(n*n).(not good ).
    //     int []rightsum=new int[nums.length];
    //     int []leftsum=new int[nums.length];
    // for (int i =0 ;i<nums.length ;i++){
    //      int sum = 0;
    //     for (int j=i+1;j<nums.length;j++){
    //        sum +=nums[j];
    //     }
    //     rightsum[i]=sum;
    // }
    // for (int i =0 ;i<nums.length ;i++){
    //      int sum = 0;
    //     for (int j=0;j<i;j++){
    //        sum +=nums[j];
    //     }
    //     leftsum[i]=sum;
    // }
    // int []ans = new int[nums.length];
    // for (int i =0;i<nums.length;i++){
    //     ans[i]=Math.abs(leftsum[i]-rightsum[i]);
    // }
    //this is my optimal solution time complexity O(n).
    int total =0;
    for (int i =0;i<nums.length;i++){
        total+=nums[i];
    }
    int leftsum=0;
    int rightsum =total;
    int []ans = new int [nums.length];
    for (int i =0;i<nums.length ;i++){ 
        rightsum= rightsum-nums[i];
         ans [i]= Math.abs(rightsum-leftsum);
         leftsum = leftsum+nums[i]; 
    }
    return ans ;
     }  
}