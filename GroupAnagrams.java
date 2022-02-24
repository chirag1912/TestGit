//Undrstanding List<List<Integer>>
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         List<List<String>> arr= new ArrayList<>();
        
        
        ArrayList<String> arr1=new ArrayList<>();
        arr1.add("");
        arr.add(arr1);
        
        if(strs.length==1){
            System.out.println("Entering");
            return arr;
        }
        
        return arr;
    }
}


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         
        HashMap<String,List<String>> map=new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
            char[] ca=strs[i].toCharArray();
            Arrays.sort(ca);
            // String str=ca.toString();
            String str=String.valueOf(ca);      //need to use string.valueOf(ca)// charcater array;
            if(!map.containsKey(str)){
                map.put(str, new ArrayList());  //On using refernce of the List using ArrayList to create ths object;
            }
            map.get(str).add(strs[i]);
        }
        
        return new ArrayList(map.values());
    }
}
