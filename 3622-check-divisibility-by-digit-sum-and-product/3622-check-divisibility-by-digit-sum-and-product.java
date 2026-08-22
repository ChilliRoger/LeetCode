class Solution {
    public boolean checkDivisibility(int n) {

        int d = 0;
        int sum = 0;
        int prod = 1;
        int res;
        int temp = n;

        while (temp != 0) {
            d = temp % 10;
            sum += d;
            prod *= d;
            temp = temp / 10;
        }

        res = sum + prod;

        return n % res == 0;
    }
}