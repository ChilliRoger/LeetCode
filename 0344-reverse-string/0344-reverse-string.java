class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        char[] temp = new char[n];

        int c = 0;
        for (int i = n - 1; i >= 0; i--) {
            temp[c] = s[i];
            c++;
        }

        for (int i = 0; i < n; i++) {
            s[i] = temp[i];
        }
    }
}