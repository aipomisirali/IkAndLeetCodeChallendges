package LeetCode;

import org.junit.Test;

public class SecondHighNumber {

    @Test
    public void tsetCode(){

        int[] arr={7,89,90,7,678};
        System.out.println(secondHighest(arr));

    }

    static int secondHighest(int... nums) {
       int hinum1=Integer.MIN_VALUE;
       int hinum2=Integer.MIN_VALUE;
       int secondHighestNumber=nums[0];

       for(int i=0; i<nums.length; i++){
           if(nums[i]>hinum1){
               hinum2=hinum1;
               hinum1=nums[i];

           }else if(nums[i]>hinum2){
               hinum2=nums[i];

           }
       }
       return hinum2;
    }
}
