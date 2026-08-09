class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList ans = phonepad("",digits);
        return ans ;
    } 
    static String[] keys = { "", "", "abc", "def",  "ghi",  "jkl",  "mno", "pqrs", "tuv", "wxyz"};
    static ArrayList<String> phonepad(String processed , String unprocessed){
          ArrayList<String> list = new ArrayList<>();
        if (unprocessed.isEmpty()){
            list.add(processed);
             return list;
        }
        int digit = (char)unprocessed.charAt(0)-'0';
        String letters= keys[digit];
        ArrayList<String> ans = new ArrayList<>();
        for (int i=0;i<letters.length();i++){
            char ch = letters .charAt(i);
            ans.addAll(phonepad(processed+ch , unprocessed.substring(1)));
        }
        return ans ;
    }
}