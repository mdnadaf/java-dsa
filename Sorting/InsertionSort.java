
public class InsertionSort {

    static void sort(int []arr){
        for(int i=1; i<arr.length; i++){
            int key=arr[i];
            int j;
            for(j=i-1; j>=0 && arr[j]>key; j--){
                arr[j+1] = arr[j]; // shift
                 }
            arr[j+1] = key;
            }
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
        

    public static void main(String[]args){
        int []arr = {90,14,30,18,10};
        sort(arr);
    }
}

// ######### Insertion Sort ##################
/*
Cards arrange karne jaisa
Sorted part me current element ko sahi position par insert karte hain
Stable
Adaptive
*/

// Time Complexity
/*
best case    : O(n)
average case : O(n²)
worst case   : O(n²)
*/

// Space Complexity : O(1)