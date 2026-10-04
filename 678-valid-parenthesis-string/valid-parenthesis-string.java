class Solution {
    public boolean checkValidString(String s) {
      Stack<Integer> star = new Stack <>();
      Stack <Integer> open = new Stack <>();
      for (int i =0;i<s.length();i++){
        char ch = s.charAt(i);  
        if (ch=='(')  open.push(i);
        else if (ch=='*') star.push(i);
        else {
            if(!open.empty())open.pop();
            else if (!star.empty()) star.pop();
            else    return false;
        
        }
      }
      while (!open.empty()){
        if (star.empty())  return false ;
        if (open.peek()>star.peek()) return false ;
        star.pop();
        open.pop();
      }
      
      return true;
    }
}