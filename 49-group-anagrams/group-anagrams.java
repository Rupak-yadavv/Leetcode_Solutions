class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String , List<String>> map = new HashMap<>();
        for (String s :strs){
            char [] ch = s.toCharArray();
            Arrays.sort(ch);
          String word = new String (ch);
          if (map.containsKey(word)){
            List<String > list= map.get(word);
            list.add(s);
            map.put(word , list);
          }
          else {
            List<String> list = new ArrayList<>();
            list.add(s);
              map.put(word, list);
          }
        }
        return new ArrayList<>(map.values());
}
}