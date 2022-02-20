//Check if given 2 strings are anagrams or not;

//TC:O(nlogn);
//SC:O(1); as only 26 characters are there in a hashSet;

class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()) return false;
        char str1[]=s.toCharArray();
        char str2[]=t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1,str2);
    }
}
