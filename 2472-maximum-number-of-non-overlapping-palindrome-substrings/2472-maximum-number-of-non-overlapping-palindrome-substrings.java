class Solution {
    public int maxPalindromes(String s, int k) {
        int count = 0;
        int i = 0;

        while (i <= s.length() - k) {

            if (ispalindrome(s, i, i + k - 1)) {
                count++;
                i = i + k;
            }
            else if (i + k < s.length() &&
                     ispalindrome(s, i, i + k)) {
                count++;
                i = i + k + 1;
            }
            else {
                i++;
            }
        }

        return count;
    }

    public boolean ispalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}