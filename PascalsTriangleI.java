import java.util.Scanner;

public class PascalsTriangleI {
    public static int pascalTriangleI(int r, int c) {
        int res = 1;
        for (int i = 1; i < c; i++) {
            res = res * (r - i);
            res = res / i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(pascalTriangleI(r, c));

        sc.close();
    }
}