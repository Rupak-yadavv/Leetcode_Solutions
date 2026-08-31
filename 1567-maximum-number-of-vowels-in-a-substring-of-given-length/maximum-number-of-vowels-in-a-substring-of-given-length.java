class Solution {
    public int maxVowels(String s, int k) {
       char [] arr = s.toCharArray();
       int count =0;
       for (int i =0;i<k;i++){
        if (isVowel(arr[i])){
            count++;
        }
       } 
       int max = count ;
       for (int i =k ;i<arr.length ;i++){
        if (isVowel(arr[i-k])){
            count--;
        }
         if (isVowel(arr[i])){
            count++;
       }
       max = Math.max(count , max );
    }
    return max ;
    }
    static boolean isVowel(char ch ){
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true ;
        }    
     return false ;
    }
}