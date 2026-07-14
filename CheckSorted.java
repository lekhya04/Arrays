 import java.util.ArrayList;
import java.util.Scanner;

public class CheckSorted { 

    public boolean isSorted(ArrayList<Integer> nums) {
        if (nums.size() <= 1) {
            return true;
        }

        int n = 0;
        for (int i = 0; i < nums.size() - 1 && nums.get(i) <= nums.get(i + 1); i++) {
            n++;
        }

        if (n == nums.size() - 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            nums.add(sc.nextInt());
        }
        CheckSorted obj = new CheckSorted();
        boolean result = obj.isSorted(nums);

        if (result) {
            System.out.println("The ArrayList is sorted.");
        } else {
            System.out.println("The ArrayList is not sorted.");
        }

        sc.close();
    }
}
