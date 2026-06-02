class MergeSort {

    public static void mergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        sort(arr, temp, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int[] temp, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;

        sort(arr, temp, left, mid);
        sort(arr, temp, mid + 1, right);

        // Optimization: already sorted
        if (arr[mid] <= arr[mid + 1]) return;

        merge(arr, temp, left, mid, right);
    }

    private static void merge(int[] arr, int[] temp,
                              int left, int mid, int right) {

        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (int p = left; p <= right; p++) {
            arr[p] = temp[p];
        }

        // Current merged part
        System.out.print("Merged [" + left + "-" + right + "] : ");
        for (int p = left; p <= right; p++) {
            System.out.print(arr[p] + " ");
        }
        System.out.println();
    }

    static void display(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {4, 6, 3, 1, 8, 2, 9, 5};

        System.out.print("Original Array: ");
        display(arr);

        mergeSort(arr);

        System.out.print("Sorted Array: ");
        display(arr);
    }
}

// ######### Merge Sort ##################
/*
Divide and Conquer
Array ko recursively divide karte hain
Phir sorted arrays ko merge karte hain
Stable
In-place nahi hai
*/

// Time Complexity
/*
best case    : O(n log n)
average case : O(n log n)
worst case   : O(n log n)
*/

// Space Complexity : O(n)