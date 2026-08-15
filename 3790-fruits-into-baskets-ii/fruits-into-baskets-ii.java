class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        int count = n; 
        boolean [] b = new boolean [n];
        for (int i =0;i<n; i++){
            int j=0;
              while(j<n){
                if (!b[j] && fruits[i]<=baskets[j]){
                    count--;
                    b[j]=true;
                    break ;
                  
                }
                j++;
            }
        }
        return count;
    }
}