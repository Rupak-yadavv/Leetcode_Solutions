class Solution {
    public List<String> generateParenthesis(int n) {
        //Rupak
    List<String> list= new ArrayList<>();
     paren( list ,"",0,0,n);
     return list;
        
    }
    private void paren( List<String> list,String c , int open , int close , int n ){
         
        if (c.length()==2*n){
            list.add(c);
            return ;
        }  
        if (open <n){
            paren(list, c+'(' ,open +1,close, n);
        } 
        if (close <open ){
            paren(list ,c+')',open, close+1, n);
        }

        }
    }
