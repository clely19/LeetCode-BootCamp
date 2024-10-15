class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        //variables
        List<Integer> result = new ArrayList<>();

        //pass the substring of string s from the currrent counter uptil the lenght of the p string
         //if yes let that be the strting pint f the array and the end point be the last counter value
        for (int i = 0; i <= s.length() - p.length(); i++) {
            String substring = s.substring(i, i + p.length()); // current substring
            if (isAnagram(substring, p)) {
                result.add(i); // if anagram, add the start index to result
            }
        }
        return result;
       
    }



        //use a helper fnudtion to find if the string passed is an anagram of p or not
    private static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        
        //keep track of all characters
        int[] counts = new int[26];
        
        //inc counter for letters in s1
        for (char c : s1.toCharArray()) {
            counts[c - 'a']++;
        }
        //dec counter for letters in s2
        for (char c : s2.toCharArray()) {
            counts[c - 'a']--;
        }
        
        //if any value is non zero, it mean it is not an anagram
        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }
        
        return true;
    }
}
