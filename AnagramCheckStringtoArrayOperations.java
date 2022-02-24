map.keySet() 
    
    for(char c: map.keySet()){
        //traverse to check if the map has frequency pf more then one?
    }

    return new ArrayList(map.values()); will create a new ArrayList [] and return in the form of ArrayList<ArrayList<String>> type();


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

//TC: O(N)
//SC: O(1) as using hashTable and only 26 characters will be there; ascii-'a' willl give the number in range 0-26;
class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()) return false;
        
        //using HashMap() to store the ount of each of the strings being identified;
        int i=0;
        // HashMap<Character,Integer> map=new HashMap<>();
        int counter[]=new int[26];  //this is hashTable;
        
        //Catch being: do the -- and ++ for both the given string characters at the same time;
        //And then another loop if used to check if values!=0 return false; should be fine;
        while(i<s.length()){
            counter[s.charAt(i)-'a']++;
            counter[t.charAt(i)-'a']--;
            i++;
        }
        
        for(int ctr:counter){
            if(ctr!=0){
                return false;
            }
        }
        return true;
    }
}
