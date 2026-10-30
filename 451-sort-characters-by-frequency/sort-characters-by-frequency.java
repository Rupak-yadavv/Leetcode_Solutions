class helper implements Comparable<helper> {
    char ch  ;
    int freq;
    helper(char ch , int freq ){
        this.ch= ch;
        this.freq=freq;
    }
    public int compareTo(helper h){
        return Integer.compare(h.freq, this.freq);
    }
}
class Solution {
    public String frequencySort(String s) {
        HashMap<Character , Integer > map = new HashMap<>();
        PriorityQueue<helper> pq = new PriorityQueue<>();
        for (char ch :s.toCharArray()){
            map.put(ch , map.getOrDefault(ch , 0)+1);
        }
        for (char ch :map.keySet()){
            int freq=map.get(ch);
            pq.add(new helper(ch ,freq));
        }
        String ans="";
        while(!pq.isEmpty()){
            helper top =pq.remove();
             for (int i = 0; i < top.freq; i++) {
               ans+=top.ch;
             }
        }
        return ans;    
    }
}