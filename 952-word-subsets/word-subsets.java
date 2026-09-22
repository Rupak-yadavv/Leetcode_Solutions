class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
      //    HashMap <Character , Integer > map1 = new HashMap<>();
        int freq[] = new int [26];
        List<String> list = new ArrayList<>();
        for (String s :words2){
            int temp[] = new int [26];
        for (char ch : s.toCharArray()){
            temp[ch-'a']++;
        }
        for (int i =0;i<26 ;i++){
            freq[i]=Math.max(freq[i],temp[i]);
        }
        }
        for(String s :words1){
            int [] need = freq.clone();
            for (char ch :s.toCharArray()){
                if (need[ch-'a']>0){
                    need[ch-'a']--;
                }
            }
            boolean b =true ;
            for (int i =0;i<26 ;i++){
                if (need[i]>0){
                    b =false ;
                    break ;
                }
            }
            if (b){
                list.add(s);
            }
        }
        return list ;

    }
}