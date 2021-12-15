import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HSet {
	
	
	public static void main(String args[]) {
		
		int a[]= new int[2];		//size is compulasry new int[2]; size is compulsary when declaring for the array;
		int arr[]=new int[] {1,2,3};		//after new int[]{12,24,37};
		int arr1[]= {1,23,46};	//directly
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		char c='a';
		System.out.println(c+'a');
		System.out.println(0+' ');
		
		//Trying to print any value of alphabet in combination with integer will return an ascii value;
		System.out.println(Int('c'));
//		System.out.println(charAt());
		
		
//		System.out.println(a[1]);
//		System.out.println(a.length);
	
		HashSet<String> newSet= new HashSet<>();
		newSet.add("Hello");
		newSet.add("how");
		newSet.add("are");
		newSet.add("friend");
		
		
		Iterator<String> it=newSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		newSet.remove("how");	
		System.out.println(newSet.size());
		System.out.println(newSet.contains("how"));
		newSet.clear();
		
		
		//HashSet<Integer> newSet=new HashSet<>();
		//add(), size(), remove(), contains("key"), clear(), isEmpty(), 
		//newSet.hashCode()	//gives back the hashCode;
		//toArray() //to convert
		
		
		
		
		
		
	}
	
}
