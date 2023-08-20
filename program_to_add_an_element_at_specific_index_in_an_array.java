import java.util.Arrays;

class add{
    static void addElement(int[] arr,int index,int element){
        for(int i=arr.length-2; i>=index; i--){
            arr[i+1] = arr[i];
            if(i==index){
                arr[i] = element;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
    public static void main(String[] args){
        int[] arr1 = new int[10];
        arr1[0] = 1;
        arr1[1] = 3;
        arr1[2] = 4;
        arr1[3] = 5;
        addElement(arr1,1,2);
    }
}
