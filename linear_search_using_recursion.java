import java.lang.reflect.Array;
import java.util.ArrayList;

class ls{
    static boolean isExist(int[] arr,int target,int index){
        if(arr[index] == target){
            System.out.println("the target is at "+index);
            return true;
        }

        if(arr[index] != target && index == arr.length-1){
            System.out.println("the target doesn't exist");
            return false;
        }

        return arr[index] == target || isExist(arr,target,index+1);
    }
    static ArrayList isExistMultiple(int[] arr,int target, int index, ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return isExistMultiple(arr,target,index+1,list);
    }
    public static void main(String args[]){
        ArrayList<Integer> array = new ArrayList<>();
        int[] arr1 = {4,8,2,6,1};
        System.out.println(isExist(arr1,1,0));
        int[] arr2 = {4,8,2,6,1,8,4};
        System.out.println(isExistMultiple(arr2,4,0,array));

    }
}
