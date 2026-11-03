class Solution {
    public int minimumOperations(int[] nums) {
       // PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashSet<Integer> set = new HashSet<>(); 
      for (int i =0;i<nums.length ;i++){
        if(nums[i]>0)
        set.add(nums[i]);
      }
    //   for (int x:set.KeySet()){
    //     if(x>0)pq.add(x);
    //   }
      return set.size();
    }
}