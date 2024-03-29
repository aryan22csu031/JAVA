package StriverDSASheet;

import java.util.Arrays;

public class minimumNooOfPlatforms {
    public static int calculateMinPatforms(int at[], int dt[], int n) {
        Arrays.sort(at);
        Arrays.sort(dt);
        int m = 1;
        int max = 1;
        int i=1, j=0;
        while(i<n && j<n){
            if(at[i]<=dt[j]){
                m++;
                i++;
                if(m>max){
                    max = m;
                }
            }else{
                m--;
                j++;
            }
        }
        return max;
    }
}
