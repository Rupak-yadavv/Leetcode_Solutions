class Solution {
    public String[] findRelativeRanks(int[] score) {
        int [] copy= score.clone();
     PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
     for (int i =0;i<score.length ;i++){
        pq.add(score[i]);
     }   
     HashMap<Integer, String > map =new HashMap<>();
     int i =1;
     while(pq.size()>0){
        if(i==1){
        map.put(pq.remove(),"Gold Medal");
        }
        if (i==2){
            map.put(pq.remove(),"Silver Medal");
        }
        if(i==3){
            map.put(pq.remove(),"Bronze Medal");
        }
        if(i>3)
        map.put(pq.remove(),String.valueOf(i));
        i++;
     }
     String [] ans = new String [copy.length];
     for (int j=0;j<copy.length;j++){
        ans[j]=map.get(copy[j]);
     }
     return ans ;
    }
}