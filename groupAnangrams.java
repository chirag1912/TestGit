import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<Double,List<String>> Hmap=new HashMap<>();
        int len=strs.length;
    
        for(int i=0;i<strs.length;i++){
            Double pproduct= primeProduct(strs[i]);
            if(!Hmap.containsKey(pproduct)){
                Hmap.put(pproduct, new ArrayList<>());
            }
            Hmap.get(pproduct).add(strs[i]);
        }
        return new ArrayList<>(Hmap.values());
    }
    
        private double primeProduct(String s){
            double result=1;
            int primes[]={
                2,	3,	5,	7,	11,	13,	17,	19,	23,	29,
                31,	37,	41,	43,	47,	53,	59,	61,	67,	71,
                73,	79,	83,	89,	97,	101};
            
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                result =result*primes[c-'a'];
            }
            return result;
        }
        
    
}