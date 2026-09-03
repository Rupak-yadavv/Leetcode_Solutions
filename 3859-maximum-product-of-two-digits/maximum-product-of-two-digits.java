class Solution {
    public int maxProduct(int n) {
      int max = -1;
      int secondmax= -1;
        while (n!=0){
            int digit =n%10;    
          if (digit >max){
             secondmax = max ;
             max = digit ;
          }else if(digit >secondmax) {
              secondmax = digit ;
          }
            n= n/10;
        } 
        return max*secondmax ;
        
    }
}