class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
      permute(nums,0,result);
        return result  ;
    }
    static void permute(int [] nums , int st , List<List<Integer>> result){
        if (st==nums.length){
            ArrayList<Integer> list= new ArrayList<>();
            for (int ele:nums){
            list.add(ele);
            }
            result.add(list);
           return  ;
        }
        for (int i=st;i<nums.length;i++){
             swap(nums,st,i);
              permute(nums,st+1, result);
           swap(nums, st, i);
        }
    }
    static void swap(int [] nums, int i ,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}