//Problem: PalindromeString
//Platform: GeeksforGeeks
//Day: 03


class Solution {
    boolean isPalindrome(String s) {
    //Method 1
        // String rev="";
        // for(int i=s.length()-1;i>=0;i--)
        // {
        //    rev=rev+s.charAt(i);
        // }
        // if(s.equals(rev))
        //  return true;
        // else
        //   return false
//Method2            
     String rev=new StringBuilder(s).reverse().toString();
     if(s.equals(rev))
       return true;
     else
       return false;
        
    }
}
