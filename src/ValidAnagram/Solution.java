package ValidAnagram;


import java.util.Arrays;

public class Solution {

    /**
     * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
     */

    ///////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * The solution that will return true (Strings are anagrams)
     */
    public static boolean isAnagramTrue(String s, String t) {
       char[] sChar = s.toCharArray();
       char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        return Arrays.equals(sChar, tChar);
    }


    /**
     * The solution that will return false (Strings aren't anagrams)
     */
    public static boolean isAnagramFalse(String r, String i) {
        char[] rChar = r.toCharArray();
        char[] iChar = i.toCharArray();

        Arrays.sort(rChar);
        Arrays.sort(iChar);

        return Arrays.equals(rChar, iChar);
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        String r = "car";
        String i = "rag";

        System.out.println(Solution.isAnagramTrue(s, t));
        System.out.println(Solution.isAnagramFalse(r, i));
    }
}
