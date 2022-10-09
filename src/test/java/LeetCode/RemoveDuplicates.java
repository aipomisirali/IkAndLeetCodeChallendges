package LeetCode;

import org.junit.Test;

import java.util.Set;
import java.util.LinkedHashSet;



public class RemoveDuplicates {

    @Test
    public void tsetCode(){

        String str="";
        System.out.println(removeDup2("sdgfsjjjjdfgsdhjfg"));

    }

    public static String removeDup2(String str) {
        String strNoDup = "";

        char[] chaArr=str.toCharArray();
        Set<Character>removeDuplChaers= new LinkedHashSet<>();
        for (char singleChars:chaArr){

            if (removeDuplChaers.add(singleChars)){
                strNoDup += singleChars;
            }

        }return strNoDup;






    }
}
