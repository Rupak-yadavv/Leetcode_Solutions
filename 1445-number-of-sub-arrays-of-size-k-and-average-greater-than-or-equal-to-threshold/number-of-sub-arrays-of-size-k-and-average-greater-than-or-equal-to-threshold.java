class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        double sum = 0 ;
        int count =0;
        for (int i =0;i<k ;i++){
            sum+=arr[i];
        }
             if (sum >=threshold*k ){
                count++;
            }
      //  double  max =sum ;
      //  double avg = 0.00;
        for (int i =k;i<arr.length;i++){
            sum = sum -arr[i-k];
            sum = sum +arr[i];
           // max = Math.max(sum , max );
            if (sum >=threshold*k ){
                count++;
            }
        }
        return count ;
    }
}