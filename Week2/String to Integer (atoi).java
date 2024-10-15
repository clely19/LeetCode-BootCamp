class Solution {
    public int myAtoi(String s) {
        //if the string is empty or null return 0
        if (s == null || s.isEmpty()) {
            return 0;
        }

        //variables
        int i = 0, sign = 1, result = 0;
        int n = s.length();

        // ignore the whitepsace
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        // account for sign of number
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        // skip any leading zeros
        //round the integer if it is out of the range: [-2^31, 2^31 - 1] i.e.. integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1
        while (i < n && Character.isDigit(s.charAt(i))) {
            //ascii value for the character
            int digit = s.charAt(i) - '0';

            // Check for overflow or underflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }
       //return the integer 
       return result * sign;
    }
}
