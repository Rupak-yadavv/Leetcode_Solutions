class helper implements Comparable<helper>{
    String s ;
    int freq ;
    helper(String s , int freq){
        this.s= s;
        this.freq= freq;
    }
    public int compareTo(helper h ){
        if (this.freq== h.freq) return (h.s.compareTo(this.s));
        return Integer.compare(this.freq, h.freq);
    }
}
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
      HashMap<String, Integer> map = new HashMap<>();
      for (int i =0;i<words.length;i++){
        map.put(words[i],map.getOrDefault(words[i],0)+1);
      }  
      PriorityQueue<helper> pq = new PriorityQueue<>();
     for (String s : map.keySet()){
        int freq= map.get(s);
        pq.add(new helper(s, freq));
        if (pq.size()>k)pq.remove();
     }
     List<String > list = new ArrayList<>();
     while(pq.size()!=0){
        helper str = pq.remove();
        list.add(str.s);
     }
     Collections.reverse(list);
     return list ;
    }
}