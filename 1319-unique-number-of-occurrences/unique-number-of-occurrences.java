class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer , Integer > map = new HashMap<>();
        int n = arr.length ;
        // if (n<=2){
        //     return false ;
        // }
        for (int i =0;i< n ;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        HashSet <Integer > set = new HashSet <>();
        for (int num: map.values()){
            if (!set.add(num)){
                return false ;
            }
        }
        return true ;
    }
}