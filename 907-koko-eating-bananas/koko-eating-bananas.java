class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l =1;
        int r = 0;
        for (int ele:piles){
            r = Math.max(r , ele);
        }
        int ans = -1;
        while (l<=r){
           int mid = l+(r-l)/2;
            if (solve(mid , piles,h)){
                ans =mid ;
                r = mid -1;
            }
            else {
            l =mid+1;
        }
    }
    return ans;
    }
      static boolean solve(int k , int [] piles , int h){
      long ans =0;
      for (int pile:piles){
        ans = ans +(int)Math.ceil((double)pile/k);
      }
      return ans<=h;
    }
    }