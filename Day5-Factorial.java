//Problem: Factorial
//Platorm: GeeksforGeeks
//Day: 05
class Solution {
    int factorial(int n) {
        // code here
        int f=1;
       for(int i=n;i>0;i--)
       {
           f*=i;
       }
        return f;
    }
}
