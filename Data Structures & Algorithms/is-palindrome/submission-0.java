class Solution {
    public boolean isPalindrome(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder p = new StringBuilder(clean);
        String reverse = p.reverse().toString();
        if(reverse.equals(clean)){
            return true;
        }
        return false;
    }
}
