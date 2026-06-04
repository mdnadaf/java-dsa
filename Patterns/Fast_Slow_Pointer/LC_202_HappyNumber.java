public class LC_202_HappyNumber {

    private static int getNext(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }

    public static boolean isHappy(int n) {

        int slow = n;
        int fast = getNext(n);

        while (fast != 1 && slow != fast) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }

        return fast == 1;
    }

    public static void main(String[] args) {

        int n = 19;

        if (isHappy(n)) {
            System.out.println(n + " is a Happy Number");
        } else {
            System.out.println(n + " is not a Happy Number");
        }
    }
}

// time complexity : O(log(n))
// space complexity : O(1)