import java.util.Scanner;
public class LargestElement {
    public int largestElement(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        return max;
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

        LargestElement obj = new LargestElement();
        int largest = obj.largestElement(nums);

        System.out.println("Largest element: " + largest);

        sc.close();
    }
}
