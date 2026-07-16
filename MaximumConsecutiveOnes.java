import java.util.Scanner;

public class MaximumConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, cnt = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cnt++;
                if (cnt > max) {
                    max = cnt;
                }
            } else {
                cnt = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(findMaxConsecutiveOnes(nums));

        sc.close();
    }
}