class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean used [] = new boolean [nums.length];
        List<Integer > list = new ArrayList<>();
        backtrack (nums, used , list);
        return ans;
        
    }
    public void backtrack( int [] nums ,boolean [] used ,  List<Integer> list){
        if (list.size()==nums.length){
            ans.add(new ArrayList<>(list));
            return ;
        }
        for (int i =0;i<nums.length;i++){
            if (i>0 && nums[i]==nums[i-1] && !used[i-1] || (used[i])) continue;
            list.add(nums[i]);
            used[i]=true;
            backtrack(nums , used , list);
            list.remove(list.size()-1);
             used[i]=false;
        }
        }
    }