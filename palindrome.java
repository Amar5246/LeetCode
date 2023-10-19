class Solution {
    public boolean isPalindrome(int x) {
        int r;
        int rev=0;
        int n=x; 
        if(n<0) 
        {
            return false; 
        }  
        else 
        {
            while(n!=0) 
            { 
            r=0;
            r=n%10;  
            rev=(rev*10)+r;
            n=n/10; 
            } 
        }
        if(rev==x) 
        {
             return true;
        } 
        else
        {
             return false;
        }
    }
}