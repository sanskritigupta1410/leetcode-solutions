class Solution {
    public boolean isPalindrome(int x) {
        int s=0,rev;
        int or=x;
        while(x>0){
            rev =x%10;
            s=s*10+rev;
             
            x=x/10;
        }
        if(s==or){
            return true;
        }
        else{
            return false;
        }
    }
}