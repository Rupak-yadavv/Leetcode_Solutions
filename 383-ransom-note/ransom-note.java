class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap <Character , Integer> map1 = new HashMap<>();
      //  HashMap<String , Integer> map2 = new HashMap<>();
        for (char ch1:magazine.toCharArray()){
            map1.put(ch1 , map1.getOrDefault(ch1 , 0)+1);
        }
        for (char ch2 :ransomNote.toCharArray()){
            if(!map1.containsKey(ch2)||map1.get(ch2)==0){
               return false ;
            }
            if (map1.get(ch2)==0){
                return false ;
            }
            map1.put(ch2 , map1.get(ch2)-1);     
        }
        return true ;

    }
}