//Problem: FibonacciNumber
//platform: GeeksforGeeks
//Day:07
class Solution {
    static int nthFibonacci(int n) {
        // code here
        if(n<=1)
         return n;
         int t1=0,t2=1,next=1;
         for(int i=2;i<=n;i++)
         {
             next=t1+t2;
             t1=t2;
             t2=next;
         }
         return next;
    }
}
