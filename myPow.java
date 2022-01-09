class Solution {
    public double myPow(double x, int n) {
       if (n == 0) {
           return 1.0; 
       }
       else if (n < 0) {
           x = 1 / x;
           n = -n;
       }
       
       return fastPow(x, n);
    }

    public double fastPow(double x, int n) {
        if(n == 0) {
            return 1.0;
        }
        
        double half = fastPow(x, n / 2); 
          
        if (n % 2 == 0) {
            return half * half;
        }
        else{
             return half * half * x;
        }      
    }
}
/*
class Solution {
    public double myPow(double x, int n) {
       if (n == 0) {
           return 1.0; 
       }
       else if (n < 0) {
           x = 1 / x;
           n = Math.abs(n);
       }
       
       return fastPow(x, n);
    }

    public double fastPow(double x, int n) {
        if(n == 0) {
            return 1.0;
        }
        
        double half = fastPow(x, n / 2); 
          
        if (n % 2 == 0) {
            return half * half;
        }
        else{
             return half * half * x;
        }      
    }
}*/




