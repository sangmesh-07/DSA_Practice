class Solution {
    // Function to insert at a given position (0-based index)
    public static int[] insertAtPosition(int[] arr, int pos, int x) {
        // Create new array of +1 size
        int[] newArr = new int[arr.length + 1];

        // Copy elements before position
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        // Insert new element at pos
        newArr[pos] = x;

        // Copy remaining elements
        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }
}

// Driver class
public class AddElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int pos = 2, x = 3;

        arr = Solution.insertAtPosition(arr, pos, x);

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
