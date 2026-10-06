class Solution {
    public int[] getAverages(int[] nums, int k) {
        int [] ans = new int [nums.length];
        Arrays.fill(ans , -1);
        long sum =0;
        int window = (2*k)+1;
     
        if (window>nums.length ){
            return ans;
        }
      for(int i  =0;i<window ;i++){
        sum+=nums[i];
      }
      ans[k]=(int)(sum/window);
      int left =0;
      for (int right =window;right<nums.length;right++){
        sum+=nums[right];
        sum-=nums[left];
         ans[++k]=(int)(sum/window);
         left++;
       }
        return ans ;
    }
}