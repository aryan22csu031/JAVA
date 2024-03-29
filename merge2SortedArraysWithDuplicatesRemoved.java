package StriverDSASheet;

import java.util.ArrayList;
import java.util.List;

public class merge2SortedArraysWithDuplicatesRemoved {
    public static List< Integer > sortedArray(int []a, int []b) {
        List<Integer> list1=new ArrayList<Integer>();
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                list1.add(a[i]);
                i++;
                j++;
            }else if(a[i]<b[j]){
                list1.add(a[i]);
                i++;
            }else{
                list1.add(b[j]);
                j++;
            }
        }
        while(i<a.length){
            list1.add(a[i]);
            i++;
        }
        while(j<b.length){
            list1.add(b[j]);
            j++;
        }
        remDup(list1);
        return list1;
    }
    public static void remDup(List<Integer> l){
        for (int i = 0; i < l.size() - 1; i++) {
            if (l.get(i).equals(l.get(i + 1))) {
                l.remove(i);
                i--;
            }
        }
    }
}
