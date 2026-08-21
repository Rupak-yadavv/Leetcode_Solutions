class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int even = 0;
        int odd = 1;
        while (even <nums.length && odd<nums.length){
            if (nums[even]%2==0 ){
               even+=2;
              continue ;
              }
              else if(nums[odd]%2!=0 ){
              odd+=2;
              continue ;
              }
              else {
                 swap(nums , even , odd);
                 even+=2;
                 odd+=2;
            }
               }
        
        return nums;
    }
    static void swap(int [] nums , int first ,int second  ){
        int temp = nums[first ];
        nums[first]= nums[second];
        nums[second]=temp ;
    }
 }