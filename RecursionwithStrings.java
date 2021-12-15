
public class RecursionwithStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=recursionwithStrings("The great Engineer");
		
	}

	static String recursionwithStrings(String arg1){
		String str=arg1;
		
		
		return str + recursionwithStrings(str);
	}
	

}
