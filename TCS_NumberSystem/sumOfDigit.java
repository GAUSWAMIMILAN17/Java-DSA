package TCS_NumberSystem;

class Solution {
    // Function to repeatedly add digits until a single digit remains
    public int addDigits(int num) {
        // Loop until number has only one digit
        while (num >= 10) {
            // Initialize sum of digits to zero
            int sum = 0;

            // Extract each digit and add to sum
            while (num > 0) {
                // Add last digit to sum
                sum += num % 10;
                // Remove last digit from number
                num /= 10;
            }

            // Update number with the sum of digits
            num = sum;
        }
        // Return the single-digit number
        return num;
    }
}


class sumOfDigit{
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test case 1
        int num = 529;
        System.out.println(sol.addDigits(num));

        // Test case 2
        num = 102;
        System.out.println(sol.addDigits(num));
    }
}
