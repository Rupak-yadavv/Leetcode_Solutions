class Solution {
    public int[] arrayRankTransform(int[] arr) {
        ArrayList <Integer > uniqueArr= new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele: arr){
            if (!map.containsKey(ele)){
                uniqueArr.add(ele);
                map.put(ele , 0);
            }
        }
        Collections.sort(uniqueArr);
        for (int i =0;i<uniqueArr.size();i++){
            map.put(uniqueArr.get(i),i+1);
        }
        for (int i =0; i<arr.length ; i++){
            arr[i]= map.get(arr[i]);
        }
        return arr;
    }
}