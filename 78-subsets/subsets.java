class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        createsubset(nums , 0 , res , list);
        return res ;
       
    }
    static void createsubset(int []nums , int index , List<List<Integer>> res , List<Integer> list ){
        if (index==nums.length){
            res.add(new ArrayList<>(list));
            return ;
        }
       list.add(nums[index]);
        createsubset(nums , index+1 , res , list);
        list.remove(list.size()-1);
        createsubset(nums , index+1 , res , list);
    }
}