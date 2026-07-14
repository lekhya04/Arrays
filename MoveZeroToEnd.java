import java.util.Scanner;

public class MoveZeroToEnd {

    public void moveZeroes(int[] nums) {
        int j = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) {
            return;
        }

        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        MoveZeroToEnd obj = new MoveZeroToEnd();
        obj.moveZeroes(nums);

        System.out.print("Array after moving zeroes: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}