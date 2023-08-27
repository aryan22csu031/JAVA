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
    public static void main(String args[]){
        int[] arr1 = {4,8,2,6,1};
        System.out.println(isExist(arr1,1,0));

    }
}
