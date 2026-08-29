class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0 ;i<nums.length ;i++){
          String num = String.valueOf(nums[i]);
           for (int j=0;j<num.length();j++){
              char ch = num.charAt(j);
              int digit = ch-'0';
               list.add(digit);
                }
        }
        int [] arr = new int [list.size()];
        for (int j =0;j<list.size();j++){
            arr[j]=list.get(j);
        }
        return arr; 
    }
}