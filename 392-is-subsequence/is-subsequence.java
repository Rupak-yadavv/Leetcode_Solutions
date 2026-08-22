class Solution {
    public boolean isSubsequence(String s, String t) {
        char [] arr1 = s.toCharArray();
        char [] arr2 = t.toCharArray();
        int count =arr1.length;
        int p =0;
        for (int i = 0;i<arr1.length;i++){
            for (int j =p;j<arr2.length;j++){
                if (arr1[i]==arr2[j]){
                    count--;
                    p=j+1;
                    break ;
                }
            }
        }
        if (count ==0){
            return true ;
        }
        return false ;
    }
}