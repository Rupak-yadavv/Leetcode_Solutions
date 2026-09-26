class Solution {
    public int distributeCandies(int[] candyType) {
        int n =candyType.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i =0;i<candyType.length ;i++){
            set.add(candyType[i]);
        }
        if (set.size()<n/2){
            return set.size();
        }
        return n/2;
    }
}