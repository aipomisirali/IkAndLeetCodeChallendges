package LeetCode;

import org.junit.Test;

import java.awt.*;

public class isPolindrom {



    @Test
public void tsetCode(){
   System.out.println( findPalindrome(121));
   System.out.println(isStringPalindrome("aagga"));
}
    public boolean findPalindrome(int x) {

        if(x<0||(x/10==0&& x==0)){
            return false; }
        int LastPart=0;
        while(x>LastPart){

                    LastPart= LastPart*10+x%10;
            x/=10;
        }

        return x==LastPart||x==LastPart/10;

}

    static boolean isStringPalindrome(String str)
    {

        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;

        // While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }
}
