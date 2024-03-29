package StriverDSASheet;
import java.util.ArrayList;
import java.util.List;

class SpiralMatrix {
    public List<Integer> spiralMatrix(int[][] MATRIX) {
        List<Integer> ans = new ArrayList<>();
        int n = MATRIX.length;
        int m = MATRIX[0].length;
        int srow = 0, scol = 0, erow = n - 1, ecol = m - 1;
        int count = 0;
        int total = m * n;
        while (count < total) {
            // printing first row
            for (int i = scol; i <= ecol && count < total; i++) {
                ans.add(MATRIX[srow][i]);
                count++;
            }
            srow++;
            // printing last col
            for (int i = srow; i <= erow && count < total; i++) {
                ans.add(MATRIX[i][ecol]);
                count++;
            }
            ecol--;
            // printing last row
            for (int i = ecol; i >= scol && count < total; i--) {
                ans.add(MATRIX[erow][i]);
                count++;
            }
            erow--;
            // printing first col
            for (int i = erow; i >= srow && count < total; i--) {
                ans.add(MATRIX[i][scol]);
                count++;
            }
            scol++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] MATRIX = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        List<Integer> result = spiralMatrix.spiralMatrix(MATRIX);
        System.out.println(result);
    }
}

