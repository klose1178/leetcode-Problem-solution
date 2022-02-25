class Solution {
    fun complexNumberMultiply(num1: String, num2: String): String {
        val complex1 = num1.split("[+i]".toRegex()).toTypedArray()//\\+|i
        val complex2 = num2.split("[+i]".toRegex()).toTypedArray()
        val real1 = complex1[0].toInt()
        val imag1 = complex1[1].toInt()
        val real2 = complex2[0].toInt()
        val imag2 = complex2[1].toInt()
        return String.format("%d+%di", real1 * real2 - imag1 * imag2, real1 * imag2 + imag1 * real2)
    }
}

