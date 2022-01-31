class Solution {
    public int numberOfSteps(int num) {
       int res = 0;
        while (num > 0) {
            res += (num > 1 ? 1 : 0) + (num & 0x01);
            num >>= 1;
        }
        return res;
    }
}
