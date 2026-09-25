class Solution {
    public boolean checkIfPangram(String sentence) {
       boolean [] b = new boolean[26];
       for (char x:sentence.toCharArray()){
        b[x-'a']=true;
       } 
       for (boolean x: b){
        if(x!=true){
            return false ;
        }
       }
       return true;
    }
}