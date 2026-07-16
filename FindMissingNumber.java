import java.util.Scanner;

public class FindMissingNumber {
    public static int missingNumber(int[] nums) {
        int xor1 = 0;
        int xor2 = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            xor2 ^= nums[i];
            xor1 ^= (i + 1);
        }

        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(missingNumber(nums));

        sc.close();
    }
}