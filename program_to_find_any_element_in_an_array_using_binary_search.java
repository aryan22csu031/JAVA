class binary {
    static int binsrch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target>arr[mid]){
                start = mid+1;
            }else if(target<arr[mid]){
                end = mid-1;
            }else{
                System.out.println("the element exist at index :");
              return mid;
            }
    }
        System.out.println("the element doesn't exist having result as :");
        return -1;
    }
    public static void main(String args[]){
        int[] arr1 = {1,2,4,6,8,10};
        System.out.println(binsrch(arr1, 2));
        System.out.println(binsrch(arr1, 0));
    }
}
