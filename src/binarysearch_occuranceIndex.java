public class binarysearch_occuranceIndex {
    static int[] findFirstLast(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int mid = 0;
        boolean found = false;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                found = true;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (found == false)
            return new int[]{-1, -1};

        int left = mid;
        int right = mid;

        while (left - 1 >= 0 && arr[left - 1] == target) {
            left--;
        }

        while (right + 1 < arr.length && arr[right + 1] == target) {
            right++;
        }

        return new int[]{left, right};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4};
        int target = 2;
        int[] result = findFirstLast(arr, target);
        System.out.println("(" + result[0] + ", " + result[1] + ")");
    }
}
