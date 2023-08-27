class checkArray{
    static boolean ifsorted(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && ifsorted(arr,index+1);
    }
    public static void main(String args[]){
        int[] arr1 = {2,3,4,5};
        System.out.println(ifsorted(arr1,0));
        int[] arr2 = {5,1,9,0};
        System.out.println(ifsorted(arr2,0));
    }

}
