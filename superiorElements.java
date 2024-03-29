package StriverDSASheet;

import java.util.ArrayList;
import java.util.List;

public class superiorElements {
    public static List< Integer > superiorElements(int []a) {
        List<Integer> list1=new ArrayList<Integer>();
        int m = Integer.MIN_VALUE;
        for(int i=a.length-1;i>=0;i--){
            if(a[i]>m){
                list1.add(a[i]);
                m = a[i];
            }
        }
        return list1;
    }
}
