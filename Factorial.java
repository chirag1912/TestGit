import java.util.Arrays;

//You are provided with a number, "N". Find its factorial.
//
//Input Description:
//A positive integer is provided as an input.
//
//Output Description:
//Print the factorial of the integer.
//
//Sample Input :
//2
//Sample Output :
//2


public class Factorial {
	
	static void findFact(int num){
		
		int res=1;
		
//		while(num>=1) {
//			res=res*num;
//			num=num-1;
//		}
	 
		for(int i=1;i<=num;i++) {
			res=res*i;
		}
		System.out.println(res);
	}
	
	static int findSum(int num1,int num2) {
		int result=num1+num2;
		return result;
	}
	
	
	static double rectArea(double side) {
		double areaTotal=Math.sqrt(3)*0.25*Math.pow(side,2);
		
		return areaTotal;
	}
	
	static String multiplesofNum(int num) {
		String multiple="";
		int arr1[]=new int[10];
			for(int i=1;i<4;i++) {
				arr1[i]=num*i;
			}
			
			multiple=Arrays.toString(arr1);
//			multiple.split(",");
		return multiple;
	}
	public static void main(String[] args) {
		int num=10;
		findFact(num);
		int res=findSum(1,2);
		System.out.println(res);
		
		double side=20;
		double area=rectArea(side);
		System.out.println(area);
		
		String multiples=multiplesofNum(6);
		System.out.println(multiples);
		
	}
}
