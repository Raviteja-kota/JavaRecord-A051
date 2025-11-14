import java.util.Scanner;

public class binarysearch {
    // Binary Search method
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;  // Found target, return index
            }
            if (arr[mid] < target) {
                left = mid + 1;  // Search in right half
            } else {
                right = mid - 1; // Search in left half
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();
            int[] numbers = new int[n];
            System.out.println("Enter " + n + " sorted elements:");
            for (int i = 0; i < n; i++) {
                numbers[i] = sc.nextInt();
            }
            System.out.print("Enter the target element to search: ");
            int target = sc.nextInt();

            int result = binarySearch(numbers, target);

            if (result == -1) {
                System.out.println("Element not found");
            } else {
                System.out.println("Element " + target + " found at index: " + result);
            }
        }
    }
}
