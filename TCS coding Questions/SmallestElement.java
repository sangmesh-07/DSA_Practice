class Solution {

    // Function to find the smallest element in the array
    public static int SmallestElement(int[] arr, int n) {
        int min = arr[0];  // Initialize the minimum element with the first element

        // Iterate through the array to find the smallest element
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {  // If the current element is smaller than min, update min
                min = arr[i];
            }
        }

        return min;  // Return the smallest element found
    }
}

public class SmallestElement {

    public static void main(String[] args) {
        // Initialize an array with elements
        int[] arr1 = {2, 5, 1, 3, 0};
        int n = arr1.length;  // Size of the array

        // Call the function to find the smallest element and output the result
        int min = Solution.SmallestElement(arr1, n);
        System.out.println("The smallest element in the array is: " + min);
    }
}