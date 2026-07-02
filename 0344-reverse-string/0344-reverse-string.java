class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        Stack<Character> st = new Stack<>();
        for (char c:s){
            st.push(c);
        }
        for (int i=0;i<n;i++){
            s[i]=st.pop();
        }
    }
}