class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int ele: stones){
            pq.add(ele);
        }
        while(pq.size()>1){
            int max=pq.remove();
            int secmax=pq.remove();
            if(max!=secmax) pq.add(Math.abs(secmax-max));      
        }
        if(pq.size()==0) return 0;
        return pq.peek();
    }
}