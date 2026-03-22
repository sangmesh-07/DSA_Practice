import java.util.*;

class SecondLargest {

    public int getSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] > slargest && arr[i] != largest) {
                slargest = arr[i];
            }
        }

        if (slargest == Integer.MIN_VALUE) {
            return -1;
        }

        return slargest;
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        SecondLargest obj = new SecondLargest();
        int result = obj.getSecondLargest(arr);

        System.out.println("Second Largest Element: " + result);
    }
}
