public class Main {
    public static void main(String[] args) {
        
        //Way it comes in the questions:
        ArrayList<ArrayList<String>> listOLists = new ArrayList<ArrayList<String>>();
           //List<List<Integer>> listOLists1 = new List<List<Integer>>();
        ArrayList<ArrayList<Integer>> listOList1 = new ArrayList<ArrayList<Integer>>();
        
        ArrayList<String> singleList = new ArrayList<String>();
        singleList.add("hello");
        singleList.add("world");
        listOLists.add(singleList);

        ArrayList<String> anotherList = new ArrayList<String>();
        anotherList.add("this is another list");
        listOLists.add(anotherList);
        
        
        ArrayList<Integer> List1 = new ArrayList<>();
        listOList1.add(List1);
        
        return listOList1;        
        
        
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
