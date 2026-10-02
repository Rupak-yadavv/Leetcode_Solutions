class Solution {
    public int largestRectangleArea(int[] heights) {

// more optimised code everything is in single pass last code time complexity is also O(n)but  space complexity is also more than this one //
      Stack<Integer> st = new Stack<>();
        int max = 0;
        for (int i = 0; i <= heights.length; i++) {
            int curr = (i == heights.length) ? 0 : heights[i];
            while (!st.empty() && heights[st.peek()] > curr) {
                int h = heights[st.pop()];
                int width;
                if (st.empty()) {
                    width = i;
                } else {
                    width = i - st.peek() - 1;
                }
                max = Math.max(max, h * width);
            }

            st.push(i);
        }
      return max ;
    
    }
}