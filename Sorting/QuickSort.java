class QuickSort {

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high]; // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
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

        quickSort(arr, 0, arr.length - 1);

        System.out.print("Sorted Array: ");
        display(arr);
    }
}

// ######### Quick Sort ##################
/*
Pivot select karte hain
Pivot ke left me smaller aur right me larger elements rakhte hain
Divide and Conquer
In-place
Stable nahi hai
*/

// Time Complexity
/*
best case    : O(n log n)
average case : O(n log n)
worst case   : O(n²)
*/

// Space Complexity : O(log n)