class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max =0;
       for (int i =0;i<piles.length;i++){
        max =Math.max(max , piles[i]);
       }
        int low = 1;
        int high =max;
     
        while (low<=high){
               long ans =0;
            int mid =low+(high-low)/2;
            for (int i =0;i<piles.length;i++){
                ans+= (int)Math.ceil((double)piles[i]/mid);
            }
            if(ans<=h){
                high=mid-1;
            }
            else
                low = mid + 1;
        }
        return low;
    }
}