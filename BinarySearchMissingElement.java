public class BinarySearchMissingElement {

	
	public static int findmissing(int ar[], int N) {
		
		for(int i=0;i<ar.length;i++) {
//			System.out.println(ar[i]);
		}
		
		int low=0;
		int high=ar.length-1;
		int mid;
		
		while(low<=high) {
			mid=(low+high)/2;
			
			
			if(ar[mid]!=mid+1 && ar[mid-1]==mid-1) {
				return mid;
			}
			if (ar[mid] != mid + 1 &&
		            ar[mid - 1] == mid)
		            return (mid + 1);
		     
		        // if this is not the first
		        // missing element search
		        // in left side
		        if (ar[mid] != mid + 1)
		            high = mid - 1;
		     
		        // if it follows index+1
		        // property then search
		        // in right side
		        else
		            low = mid + 1;
		}
		
		return 767868768; 	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 2, 3, 4, 5, 7, 8};
	    int N = arr.length;
	    int x=findmissing(arr,N);
	    System.out.println(x);
	}

}
