
public class StringOperations {

	public static void main(String[] args) {
		
		String str="ABCTRFFIUFY";
	
		int arr1[]= {1,2,3,45,56};
		int arr2[]=new int[] {1,2};
		for (int abc: arr1) {
//			System.out.println(abc);
		}
		//Cannot use for each with string type;
		
		System.out.println("String Length:"+str.length());
		
		System.out.print("String with charAt(index): ");
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
		}
//		System.out.println();
		System.out.println("At position 3:"+str.charAt(3));
		
//		System.out.println(str.valueOf("a"));
		
//		char charArr[]=new char[str.length()];
//		System.out.println("New CharArr: "+ charArr);
		
	}
	
}
