// class Solution PascalTriangle{
//     public List<Integer> getRow(int rowIndex) {
        
//     }
// }
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            row.add(0, 1);
            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }
        }
        return row;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int rowIndex1 = 3;
        int rowIndex2 = 0;
        int rowIndex3 = 1;

        System.out.println(solution.getRow(rowIndex1)); // Output: [1, 3, 3, 1]
        System.out.println(solution.getRow(rowIndex2)); // Output: [1]
        System.out.println(solution.getRow(rowIndex3)); // Output: [1, 1]
    }
}
