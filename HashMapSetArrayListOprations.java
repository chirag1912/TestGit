// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        HashMap<String,Integer> map=new HashMap<>();
        map.put("hello1",123);
        map.put("hello2",465654);
        System.out.println(map);
    
        System.out.println(map.keySet().size());
        System.out.println(map.keySet());
        System.out.println(map.values());
        //return the value in array format but the answer is i the form of Hasset size only;
        
        map.containsKey("hello1");
        map.containsValue(123);
        map.remove("hello2");
        
        int arr[]=new int[10];
        System.out.println(arr);
        
        HashSet<String> set=new HashSet<>();
        set.add("abc");
        set.add("hello1111");
        set.add("hello1231");
        
        set.remove("abc");
        System.out.println(set);
        
        // Set has: add(),remove(),size()
        
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.remove(1);         //indexes being used here not the values;
        System.out.println(list);
        
    }
}
