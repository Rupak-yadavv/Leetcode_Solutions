class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>> ans = new ArrayList<>();
         String str1 ="";
         String str2= "";
        for (int i =0;i<s1.length() ;i++){
            if(s1.charAt(i)!=(s2.charAt(i))){
                str1+=s1.charAt(i);
                str2+=s2.charAt(i);
            }
            if(s1.charAt(i)==(s2.charAt(i))&& str1.length()>=1) {
                 List<String> list = new ArrayList<>();
                list.add(str1);
                list.add(str2);
                str1 ="";
                str2= "";
                ans.add(list);
            }
        }
            if(str1.length()>=1) {
                List<String> list = new ArrayList<>();
                list.add(str1);
                list.add(str2);
                ans.add(list);
            }
        return ans;
    }
}