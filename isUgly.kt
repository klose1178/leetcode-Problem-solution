class Solution {
    fun isUgly(n: Int): Boolean {
        when (n){
            0-> return false
            1,2,3,5-> return true
        }
          var ans = n
          while (0 == ans % 2)  ans /= 2
          while  (0 == ans % 3)  ans /= 3
          while  (0 == ans % 5)  ans /= 5     
          return ans == 1
    }
}
/*
class Solution {
    fun isUgly(n: Int): Boolean {
        if(n==0) return false
        else if(n==1 || n==2 || n==3 || n==5) return true 
        var ans = n
        while (0 == ans % 2)  ans /= 2
        while  (0 == ans % 3)  ans /= 3
        while  (0 == ans % 5)  ans /= 5           
        return ans == 1
    }
}
*/
