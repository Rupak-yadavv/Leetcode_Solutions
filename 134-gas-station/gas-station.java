class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total =0;
        int current=0;
        int st =0;
        for (int i =0;i<gas.length ;i++){
            total+=gas[i]-cost[i];
            current+=gas[i]-cost[i];
            if (current <0){
                current=0;
                st = i+1;
            }
        }
            if (total<0){
                return -1;
           }
       return st;
    }
}