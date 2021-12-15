
public class RecursionUseCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//Find sum of all the numbers before a given number;
		
		int num1=sumRecursion(20);
		System.out.println(num1);
		
		int num2=sumRecursion(10);
		System.out.println(num2);
	}
	
	static int sumRecursion(int num) {
		int sumResult=num;
		if(num<=1) {
			return sumResult;
		}
		
		return sumResult+sumRecursion(num-1);
	}

}
