import java.util.ArrayList;
// the program finds all the occurences of a target integer in an array, and return the indices of same in an ArrayList.
// using recursion
class rec{
    static ArrayList findAll(int[] arr, int target, int index){
        ArrayList<Integer> list1 = new ArrayList<>();
        if(index == arr.length-1){
            return list1;
        }
        if(arr[index] == target){
            list1.add(index);
        }
        ArrayList<Integer> AlltheAnswers = findAll(arr,target,index+1);
        list1.addAll(AlltheAnswers);
        return list1;
    }
    public static void main(String args[]){
        int[] arr1 = {2,2,4,5,6,2,8,10};
        System.out.println(findAll(arr1,2,0));
    }
}
