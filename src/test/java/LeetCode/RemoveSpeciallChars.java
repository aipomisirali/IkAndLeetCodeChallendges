package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class RemoveSpeciallChars {

    public static String removeSpChars(String str){

        char[] StrToChar=str.toCharArray();

         String SpecRemovedChar="";

        for(int i=0; i<StrToChar.length; i++){

            if(Character.isLetterOrDigit(StrToChar[i])){

                SpecRemovedChar+=String.valueOf(StrToChar[i]);
            }

        }


        return SpecRemovedChar;
    }
}
