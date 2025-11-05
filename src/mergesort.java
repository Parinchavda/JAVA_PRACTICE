public class mergesort {
    // Utility function to print the array
    static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Function to merge two sorted halves of the array
    static void mergearray(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    // Main merge sort function
    static void mergesort(int[] arr, int l, int r) {
        if (l >= r) return; // Correct base case
        int mid = l + (r - l) / 2;
        mergesort(arr, l, mid);
        mergesort(arr, mid + 1, r);
        mergearray(arr, l, mid, r);
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 3, 6, 41, 2, 98, 1};
        System.out.println("Before sorting:");
        printarr(arr);
        mergesort(arr, 0, arr.length - 1);
        System.out.println("After sorting:");
        printarr(arr);
    }
}
