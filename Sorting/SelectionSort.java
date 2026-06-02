public class SelectionSort {

    static void sort(int []arr){
        for(int i=0; i<arr.length; i++){
            int minPos=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos=j;
                }
            }
            // swap
            int temp=arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        for(int x : arr){
            System.out.print(x+" ");
        }

    }

    public static void main(String[]args){
        int []arr = {9,14,3,8,1};
        sort(arr);
    }
}


// ######### Selection Sort ##################
/*
Har pass me minimum element find karte hain
Aur current position se swap kar dete hain
Stable nahi hai
Adaptive nahi hai
*/

// Time Complexity
/*
best case    : O(n²)
average case : O(n²)
worst case   : O(n²)
*/

// Space Complexity : O(1)