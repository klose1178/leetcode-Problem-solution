class Solution {
    public int maxDepth(String s) {
          int ans = 0;
          int size = 0;
        for (int i = 0; i < s.length(); i++) {
           final char ch = s.charAt(i);
            if (ch == '(') {
                ++size;
                ans = Math.max(ans, size);
            } else if (ch == ')') {
                --size;
            }
        }
        return ans;
    }
}
