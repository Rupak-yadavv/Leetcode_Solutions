class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap <Character , Integer > map1 = new HashMap <>() ;
        HashMap <Character , Integer > map2 = new HashMap<>(); 
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans  = new ArrayList<>();
        for (int i =0;i<s.length() ;i++){
            char ch1 = s.charAt(i);
            if (!map1.containsKey(ch1)){
                map1.put(ch1 , i );
            }
            list.add(map1.get(ch1));
        }
       for (int i =0;i<t.length() ;i++){
            char ch2 = t.charAt(i);
            if (!map2.containsKey(ch2)){
                map2.put(ch2 , i );
            }
            ans.add(map2.get(ch2));
       }
       return list.equals(ans);
    }
}