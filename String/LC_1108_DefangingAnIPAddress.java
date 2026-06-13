public class LC_1108_DefangingAnIPAddress {

    public static String defangIPaddr(String address) {

        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {

        System.out.println(
                defangIPaddr("1.1.1.1"));
    }
}

/*
LeetCode 1108 - Defanging an IP Address

Example:
Input  : "1.1.1.1"
Output : "1[.]1[.]1[.]1"

Approach:
1. Traverse IP address.
2. Replace every '.' with "[.]".
3. Return modified string.

Time Complexity  : O(n)
Space Complexity : O(n)
*/