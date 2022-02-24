//Not just using constant space hashTable of array of 26characters
//But here taking hashMap which take SC of O(N); of the Atring array;

class Solution {
    public boolean isAnagram(String s, String t) {
     
        HashMap<Character,Integer> map=new HashMap<>();
        
        // char[] ca=s.toCharArray();
        // char[] ca=String.valueOf(s);
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if (map.containsKey(c)){
                map.put(c,map.get(c)-1);
            }else{
                return false;
            }
        }
        
        for(char ctr : map.keySet()){
            if(map.get(ctr)!=0){
                return false;
            }
        }
        return true;
    }
}
