class HeapSort {

    static void heapSort(int[] arr) {
        int n = arr.length;

        // Max Heap Build
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // One by one extract elements
        for (int i = n - 1; i > 0; i--) {

            // Root (largest) ko end me bhejo
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heap ko dobara maintain karo
            heapify(arr, i, 0);
        }
    }

    static void heapify(int[] arr, int n, int i) {

        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {

            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    static void display(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {14, 6, 13, 1, 8, 12, 9, 5};

        System.out.print("Original Array: ");
        display(arr);

        heapSort(arr);

        System.out.print("Sorted Array: ");
        display(arr);
    }
}


// ######### Heap Sort ##################
/*
Heap Data Structure use karta hai
Max Heap banakar largest element ko end me bhejte hain
In-place
Stable nahi hai
*/

// Time Complexity
/*
best case    : O(n log n)
average case : O(n log n)
worst case   : O(n log n)
*/

// Space Complexity : O(1)