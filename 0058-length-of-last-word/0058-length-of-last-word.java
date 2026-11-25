class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int lastspace=s.lastIndexOf(" ");
        int length=s.length()-1-lastspace;
        return length;
        
    }
}