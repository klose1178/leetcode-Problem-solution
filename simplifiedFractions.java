class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> ans = new ArrayList<String>();
        for (int denominator = 2; denominator <= n; ++denominator) {
            for (int numerator = 1; numerator < denominator; ++numerator) {
                if (gcd(numerator, denominator) == 1) {
                    ans.add(numerator + "/" + denominator);
                }
            }
        }
        return ans;
    }

    public int gcd(int a, int b) {
        //if (b != 0 ) return gcd(b, a % b) ;  else return a;
         return b != 0 ? gcd(b, a % b) : a;
    }
}
