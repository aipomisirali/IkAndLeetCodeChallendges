package LeetCode;

import org.junit.Test;

import java.awt.*;

public class reverseString {

    @Test
    public void tsetreverse() {
        System.out.println(ReverseHelper("Maria"));
        int[] arr={6,7,8,9,0,8,9};
        revArr(arr);

    }

    public String ReverseHelper(String str) {
        String  nstr="";
        char ch;

        for (int i=str.length()-1; i>=0; i--)
        {
            nstr=nstr+ String.valueOf(str.charAt(i)); //extracts each character
            //adds each character in front of the existing string
        }



        return nstr;

    }

    public void revArr(int[] arrNum) {
        // we will use two 'pointers'. One pointer will start from the beginning
        // another one from the back and we will swap their values

        // pointer that will start from the back
        int j = arrNum.length - 1;
        for (int i = 0; i < arrNum.length/2; i++) {
            int temp = arrNum[i];
            arrNum[i] = arrNum[j - i];
            arrNum[j - i] = temp;


        }
        for (int i:arrNum) {
            System.out.print(i);
        }


    }
    }
