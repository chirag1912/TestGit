import java.util.ArrayList;

public class FoeEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> arrList=new ArrayList<>();
		
		arrList.add("abc");
		arrList.add("bcd");
		arrList.add("def");
		
		System.out.println(arrList.contains("abc"));
		System.out.println(arrList);
		arrList.remove("abc");
		arrList.clear();
		
		
		System.out.println("-------------------------");
		String[] cars= {"BMW","Audi","Porsche"};
		
		for(String car: cars) {
			System.out.println(car);
		}
		
		
		
		
	}

}
