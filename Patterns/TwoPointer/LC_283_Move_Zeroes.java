public class LC_283_Move_Zeroes {

    public static void moveZeroes(int[] nums) {
        int left=0;
        for(int right=0; right<nums.length; right++){
            if(nums[right]!=0){
                //swap
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
            }
        }
    }

    static void display(int []arr){
        for(int x : arr){
            System.out.print(x+" ");
        }
    }

    public static void main(String[] args){
        int arr[] = {0,1,0,3,12};
        System.out.println("\nOriginal array: ");
        display(arr);
        moveZeroes(arr);
        System.out.println("\nAfter movingZeroes: ");
        display(arr);
        
    }
}

// time complexity : O(n)
// space complexity : O(1)