class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int max =0;
         int ans =0;
        for (int weight : weights) {
            max = Math.max(max, weight);
            sum += weight;
        }
            int high = sum ;
            int low = max ;
            while (low<=high){
                int mid = (low+high)/2;
                if (ispossibly(weights , days ,mid)){
                    ans = mid;
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
        return ans;
            
        }
        
    static boolean ispossibly(int []weights, int days , int capacity){
        int daysused = 1;
        int current =0;
        for (int weight : weights){
            if (weight+current>capacity){
                daysused++;
                current = weight ;
            }else {
                current = weight +current;
            }
        }
            if (daysused<=days){
                return true ;
            }
            return false ;
        }
}
   