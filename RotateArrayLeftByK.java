import java.util.Scanner;

public class RotateArrayLeftByK {

    public void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, n - 1);
        reverseArray(nums, 0, n - 1);
    }

    public void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
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

        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        RotateArrayLeftByK obj = new RotateArrayLeftByK();
        obj.rotateArray(nums, k);

        System.out.print("Array after rotation: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}