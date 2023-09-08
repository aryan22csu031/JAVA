import java.util.ArrayList;
import java.util.List;

class sub{
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.print(GetSubsets(arr));
    }
    static List<List<Integer>> GetSubsets(int[] arr){
        List<List<Integer>> subArray = new ArrayList<>();
        subArray.add(new ArrayList<>());
        for(int num:arr){
            int n = subArray.size();
            for(int i=0; i<n; i++){
                List<Integer> subsets = new ArrayList<>(subArray.get(i));
                subsets.add(num);
                subArray.add(subsets);
            }
        }
        return subArray;
    }
}
