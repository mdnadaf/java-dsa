// package Sorting;

public class BubbleSort {

    static void sort(int []arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int x : arr){
            System.out.print(x+" ");
        }

    }

    public static void main(String[]args){
        int arr[] = {3,5,2,7,1};
        sort(arr);
    }
}


/*
Bubble Sort
Adjacent elements compare hote hai
Largest element har pass me end me pahuchta hai
Stable
Best Case: O(n)
*/