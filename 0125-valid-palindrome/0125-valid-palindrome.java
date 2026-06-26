class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int left=0;
        int right = s.length() - 1;
        while(left<=right){
            char cf=s.charAt(left);
            char cl=s.charAt(right);
            if(!Character.isLetterOrDigit(cf)){
                left++;
            }
            else if(!Character.isLetterOrDigit(cl)){
                right--;
            }
            else{
                if(Character.toLowerCase(cf) != Character.toLowerCase(cl)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}