class Solution {
    public boolean isPalindrome(String s) {
        String original = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reverse = new StringBuilder(original).reverse().toString();
        if(reverse.equals(original)){
            return true;
        }
        return false;
    }
}