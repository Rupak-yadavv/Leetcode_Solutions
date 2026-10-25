class helper implements Comparable<helper>{
    int ele ;
    int freq;
    helper(int ele,int freq){
        this.ele= ele;
        this.freq= freq;
    }
    public int compareTo(helper h ){
        if (this.freq == h.freq)return Integer.compare(this.ele, h.ele);
        return Integer.compare(this.freq , h.freq);
    }
    }
    class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele: nums){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }
        int [] ans = new int[k];
      PriorityQueue<helper> pq = new PriorityQueue<>();
      for (int ele:map.keySet()){
        int freq = map.get(ele);
        pq.add(new helper(ele , freq));
        if (pq.size()>k)pq.remove();
      }
      int i =0;
      while(pq.size()!=0){
        helper top = pq.remove();
        ans[i]=top.ele;
        i++;
      }
      return ans ;
    }
}