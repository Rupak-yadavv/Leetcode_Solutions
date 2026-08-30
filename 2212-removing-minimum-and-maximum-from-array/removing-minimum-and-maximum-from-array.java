class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int temp =0;
        int p =0;
        if (nums.length<2){
            return 1;
        }
        for (int i =0;i<nums.length;i++){
            if (nums[i]<min){
              temp =i;
              min = nums[i];
            }
           
            if (nums[i]>max){
            p =i;
            max = nums[i];
            }
        }
        int left = Math.min (temp , p );
        int right = Math.max(temp , p );
        int removeLeft = right+1;
        int removeRight = nums.length-left;
        int removeBothSide = (left+1)+(nums.length-right);
        return Math.min(removeLeft ,Math.min(removeRight , removeBothSide) );
    }
}