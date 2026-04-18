class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]","");
        cleaned = cleaned.toLowerCase();
        // two pointer 
        // i starts at the beginning
        // j starts at end
        // loop through and compare i and j
        // if all match then return true
        // else reutrn false
         int j = (cleaned.length() - 1);
        for(int i = 0; i < j; i++) {
            if(cleaned.charAt(i) != cleaned.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }
}
