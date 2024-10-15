class Solution {
    public String reverseWords(String s) {
        //get rid of anyy trailing or leading whilte spaces in string s
        s = s.trim();

         StringBuilder result = new StringBuilder();

        //keep a pointer at the end of string and store the substring untill you find a space
        int end = s.length();

        //the substring needs to be added at the beginning of the new string
        //whenever the counter encounters a white space : the substring from i to end is stored in result
        // AND add a single white space to the new string
         for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                // Check if the current word exists between i+1 and end
                if (i + 1 < end) {
                    result.append(s.substring(i + 1, end)); // Append the word
                    result.append(" "); // Append a space after the word
                }
                //end of a word
                end = i; 
            }
        }
        //last word
        result.append(s.substring(0, end));

        //return thenew string 
        return result.toString();
    }
}
