class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
       if ((long)m*k>bloomDay.length){
        return -1;
       } 
       int left=0;
       int ans =-1;
       int right =0;
       for (int i =0;i<bloomDay.length;i++){
       right= Math.max(right , bloomDay[i]);
       }
       while (left<=right ){
        int  mid = left+(right-left)/2;
        if(ispossible(bloomDay , mid , m , k)){
            ans = mid;
            right = mid-1;
        }else
          left =mid+1; 
       }
      return ans;
    }
    static boolean ispossible(int [] arr , int days , int m , int k ){
       int count =0;
       int boukuet=0;
       for (int i =0;i<arr.length ;i++){
          if (arr[i]<=days){
            count++;
          }
          else {
            boukuet +=count/k;
            count=0;
          }
       }
        boukuet+=count/k;
       if (boukuet>=m){
        return true ;
       }
       return false ;
    }
}