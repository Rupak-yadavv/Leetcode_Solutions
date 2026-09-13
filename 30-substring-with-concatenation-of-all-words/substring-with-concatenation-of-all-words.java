class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        HashMap<String , Integer > map = new HashMap <>();
        List<Integer> list = new ArrayList<>();
        int wordlength = words[0].length();
        int totalWordlen= words.length;
        int totallength=wordlength*totalWordlen;
        if (s.length()<totallength){
            return list ;
        }
        for (String  word:words ){
            map.put(word , map .getOrDefault(word, 0)+1);
        }
      for (int start =0;start <wordlength;start++ ){
        int left = start ;
        int count =0;
        HashMap<String , Integer > current = new HashMap<>();
        for (int right =start;right+wordlength<=s.length();right+=wordlength){
           String word = s.substring(right , right +wordlength);
        if (!map.containsKey(word)){
            count=0;
            current.clear();
            left = right+wordlength;
            continue ;
        }
        current.put(word  ,current.getOrDefault(word , 0)+1);
        count ++;
          while (current.get(word) > map.get(word)) {
                   String leftWord = s.substring(left , left +wordlength );
                   current .put(leftWord , current.get(leftWord)-1 );
                   left+=wordlength;
                   count--;
               }
                if (count==totalWordlen){
                  list.add(left);
                   String leftWord = s.substring(left, left + wordlength);
                 current.put(leftWord , current.get(leftWord )-1);
                   left +=wordlength;
                    count--;
               }
            }
        }
      return list;
    }
}