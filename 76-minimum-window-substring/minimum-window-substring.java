class Solution {
    public String minWindow(String s, String t) {
        int have =0;
        HashMap <Character , Integer > map = new HashMap <>();
        for (char ch : t.toCharArray()){
            // freq[ch-'a']++;
            map.put(ch , map.getOrDefault(ch , 0)+1);
        }
        int left =0;
        int min = Integer.MAX_VALUE;
        int start =0;
         HashMap <Character , Integer > window = new HashMap<>();
        for (int right =0;right <s.length ();right ++){
            char ch = s.charAt(right);
            window.put(ch , window.getOrDefault(ch , 0)+1);
            if (map.containsKey(ch)&& map.get(ch).equals(window.get(ch)))
            have ++;
          while (map.size()==have){
            if (right-left+1<min){
                min = right-left+1;
                start =left ;
            }
            char leftch = s.charAt(left);
            window.put(leftch , window.get(leftch)-1);
            if (map.containsKey(leftch)&& map.get(leftch)>window.get(leftch)){
            have --;
            }
          left++;
          }
        }
        if (min==Integer.MAX_VALUE){
            return "";
        }else 
        return s.substring (start , start +min);
        
    }
}