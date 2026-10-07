////Problem: ArmstrongNumber
//Platform: GeeksforGeeks
//Day: 06
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int m=n,count=0;
        while(n!=0)
        {
            int rem=n%10;
            count+=rem*rem*rem;
            n/=10;
        }
        if(s==m)
        return true;
        else
        return false;
    }
}
