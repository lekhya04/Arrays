import java.util.Scanner;

public class SecondLargestElement {
    public int secondLargestElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                smax = max;
                max = nums[i];
            } else if (nums[i] > smax && nums[i] != max) {
                smax = nums[i];
            }
        }

        return (smax == Integer.MIN_VALUE) ? -1 : smax;
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

        SecondLargestElement obj = new SecondLargestElement();
        int secondLargest = obj.secondLargestElement(nums);

        if (secondLargest == -1) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }

        sc.close();
    }
}
