/*Problem Statement: Given an array, we have found the number of occurrences of each element in the array.

Examples
Example 1:
Input: arr[] = {10,5,10,15,10,5};
Output: 10  3
	            5  2
                15  1
Explanation: 10 occurs 3 times in the array
	      5 occurs 2 times in the array
              15 occurs 1 time in the array

Example2: 
Input: arr[] = {2,2,3,4,4,2};
Output: 2  3
	           3  1
               4  2
Explanation: 2 occurs 3 times in the array
	     3 occurs 1 time in the array
             4 occurs 2 time in the array*/

class countFrequency {
    // Function to count frequency of each element in the array
    public void countFreq(int[] arr, int n) {
        // Create a visited array to mark elements that are already processed
        boolean[] visited = new boolean[n];

        // Traverse through all elements of the array
        for (int i = 0; i < n; i++) {
            // Skip this element if it's already processed
            if (visited[i])
                continue;

            // Count the frequency of arr[i]
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true; // Mark arr[j] as processed
                    count++;
                }
            }

            // Output the element and its count
            System.out.println(arr[i] + " " + count);
        }
    }

    public static void main(String[] args) {
        // Input array
        int[] arr = {10, 5, 10, 15, 10, 5};
        int n = arr.length;

        // Create Solution instance
        countFrequency sol = new countFrequency();

        // Call the function to count frequencies
        sol.countFreq(arr, n);
    }
}
