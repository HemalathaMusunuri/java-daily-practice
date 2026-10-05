//Problem: PalindromeNumber
//Platform: GeeksforGeeks
//Day:02
class Solution {
    public boolean isPalindrome(int n) {
        int org=n,rev=0;
        while(n!=0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if(org==rev)
           return true;
        else
           return false;
    }
}
