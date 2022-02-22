import java.util.HashMap;

public class HMap {

	public static void main(String[] args) {
		HashMap<String,String> Hmap=new HashMap<>();
		
		HashMap<Integer, Integer> map=new HashMap<>();
		Hmap.put("ABC","PassKEY12656");
		Hmap.put("BCD","PASSKEY7867678");
		Hmap.put("DEF","PASSKEY98789778");
		map.put(1,2);
		
		
		System.out.println(Hmap);
		
		System.out.println("Map with integer: "+map.get(1));
		
		System.out.println(Hmap.get("ABC"));
		
		HashMap<String,<List>> map1=new HashMap<>();
		map1.put("abc",[]);
		map1.get("abc").add("Hello");
		
		System.out.println(Hmap.containsKey("ABC"));	//O(1) time
		System.out.println(Hmap.containsValue("PASSKEY7867678"));		//O(n) time
		Hmap.size();
		Hmap.replace("BCD", "NewValue");
		
		Hmap.values();		//print only values;
		System.out.println(Hmap.keySet());		//print only Key;
		
		Hmap.remove("ABC");
	}
}
