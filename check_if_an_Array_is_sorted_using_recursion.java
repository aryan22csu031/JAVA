class chk{
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,7,4};
        System.out.println(checkSorted(arr1,0));
        System.out.println(checkSorted(arr2,0));
    }
    static boolean checkSorted(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index] < arr[index+1]){
            return checkSorted(arr,index+1);
        }else{
            return false;
        }
    }
}
