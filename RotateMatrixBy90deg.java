package StriverDSASheet;

public class RotateMatrixBy90deg {
    public static void rotate90(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i=0; i<arr.length; i++){
            int s = 0;
            int e = arr.length-1;
            while(s<=e){
                int temp = arr[i][s];
                arr[i][s] = arr[i][e];
                arr[i][e] = temp;
            }
        }
    }
}
