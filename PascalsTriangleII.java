import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangleII {
    public static List<Integer> genRow(int row) {
        int ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);

        for (int i = 1; i < row; i++) {
            ans = ans * (row - i);
            ans = ans / i;
            ansRow.add(ans);
        }

        return ansRow;
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            ans.add(genRow(i));
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numRows = sc.nextInt();

        List<List<Integer>> result = generate(numRows);

        for (List<Integer> row : result) {
            System.out.println(row);
        }

        sc.close();
    }
}
