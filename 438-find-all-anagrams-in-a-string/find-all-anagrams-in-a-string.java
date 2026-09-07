class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       List <Integer> list = new ArrayList<>();
       int k = p.length();
       int left = 0;
       int [] p_table = new int [26];
       int [] w_table = new int [26];
       for (char ch :p.toCharArray()){
          p_table[ch-'a']++;
       }
       for (int  right=0; right < s.length (); right ++){
          
          w_table[s.charAt(right)-'a']++;

        if (right-left+1==k){
            if (Arrays.equals(p_table, w_table)){
                list.add(left);
            }
         w_table[s.charAt(left)-'a']--;
            left++;

        }
       }
       return list ;
    }
}