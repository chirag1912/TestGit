public class Main {
    public static void main(String[] args) {
        // Int[] arr=new arr;
        int[] arr=new int[10];
        // arr={1,2,3};
        int[] arr1={1,2,3};
        arr[0]=1;
        for(int x : arr1){
            // System.out.print(x);
        }
        
        
        ArrayList arrList=new ArrayList<>();
        //ArrayList<String> arrList1=new ArrayList<>();
        arrList.add("Apple");
        arrList.add("Oranges");
        arrList.add("Chiko");
        System.out.println(arrList);
        
        
        int element = arr.get(2);
 
        // Displaying element at specified index
        // on console inside list
        System.out.println("the element at index 2 is "
                           + element);
        
        arrList.remove("Oranges");
        arrList.contains("Apple");
        arrList.clear();
        
        
        //remove(""), add(""), clear()
    }
}
