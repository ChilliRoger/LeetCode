class Solution {
    public String smallestPalindrome(String s) {
      int n = s.length();
      int part = n/2;
      char[]  chars = s.toCharArray();
      Arrays.sort(chars,0,part);
      for (int i=0;i<part;i++){
        chars[n-1-i]=chars[i];
      }
      return new String(chars);
    }
}