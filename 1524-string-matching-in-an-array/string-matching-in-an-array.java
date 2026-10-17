class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        for (int i =0;i<words.length;i++){
            String s= words[i];
            for (int j =0;j<words.length;j++){
                String x = words[j]; 
                if (x.contains(s) && i!=j){
                    list.add(s);
                    break;
                }
            }
        }
        return list ;
    }
}