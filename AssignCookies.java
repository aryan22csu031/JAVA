package StriverDSASheet;

import java.util.*;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int maxValue = 0;
        int j=0;
        int i=0;
        while(s.length>j && g.length>i){
            if(g[i]<=s[j]){
                maxValue++;
                i++;
                j++;
            }else{
                j++;
            }
        }
        return maxValue;
    }
}
