public class binary_find_target_rotated_duplicates {
    static int checkduplicates(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) return mid;

            // If duplicates at the edges
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
            } else if (arr[start] <= arr[mid]) { // start to mid is sorted
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1; // Target in start to mid
                } else {
                    start = mid + 1; // Target in right half
                }
            } else { // mid to end is sorted  mean when mid is lessthen end
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1; // Target in right half
                } else {
                    end = mid - 1; // Target in left half
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 0, 1, 1, 1, 2, 0, 0, 0};
        int target = 2;
        System.out.println(checkduplicates(arr, target)); // Output: index of 2, or -1
    }
}
