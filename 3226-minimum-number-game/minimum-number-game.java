class Solution {
    public int[] numberGame(int[] nums) {
    // String ans ="";
    int [] ans = new int [nums.length];
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for (int num: nums){
       pq.add(num);
    }  
    int i =0; 
    while(pq.size()!=0){
        int Alice= pq.remove();
        int bob = pq.remove();
        ans[i++]=bob;
        ans[i++]=Alice;
    }
    return ans;
    }
}