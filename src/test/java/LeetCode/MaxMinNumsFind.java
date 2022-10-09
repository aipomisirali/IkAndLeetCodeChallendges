package LeetCode;

import org.junit.Test;

public class MaxMinNumsFind {

    @Test
    public void tsetCode(){

        int[] arr={7,89,90,7,678};
        System.out.println(max(arr));
        System.out.println(min(arr));
    }

    public int max(int[] arrNum) {
        // assume first element of array is biggest number
        int max = arrNum[0];

        // loop over the array and test our above assumption
        for(int i = 0; i < arrNum.length; i++) {
            // if max was not the biggest number, update it
            if(max < arrNum[i]) {
                max = arrNum[i];
            }
        }

        // after the loop max variable will hold the biggest number
        return max;
    }

    public int min(int[] arrNum) {
        // assume first element of array is biggest number
        int min = arrNum[0];

        // loop over the array and test our above assumption
        for(int i = 0; i < arrNum.length; i++) {
            // if max was not the biggest number, update it
            if(min > arrNum[i]) {
                min = arrNum[i];
            }
        }

        // after the loop max variable will hold the biggest number
        return min;
    }


}
