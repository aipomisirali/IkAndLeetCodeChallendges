package LeetCode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class reverseStringArrInt {

    @Test
    public void tsetreverse() {
        System.out.println(ReverseHelper("Maria"));
        int[] arr={6,7,8,9,0,8,9};
        revArr(arr);
      String s=  reverseOrderOfWords("dsjkfg gjgjgk bbb");
      int i=romanToInt("MCMXCIV");
    }
    public int romanToInt(String s) {
        Map<Character,Integer> romLet=new HashMap<>();
        romLet.put('I',1);
        romLet.put('V',5);
        romLet.put('X',10);
        romLet.put('L',50);
        romLet.put('C',100);
        romLet.put('D',500);
        romLet.put('M',1000);
        int strLen=s.length();

        int lastInd=romLet.get(s.charAt(strLen-1));
        for(int i=strLen-2; i>=0; i--){
            if(romLet.get(s.charAt(i))>=romLet.get(s.charAt(i+1))){
                lastInd+= romLet.get(s.charAt(i));
            }else{
                lastInd-=romLet.get(s.charAt(i));
            }
        }return lastInd;}



    public String ReverseHelper(String str) {
        String  nstr="";
        char ch;

        for (int i=str.length()-1; i>=0; i--)
        {
            nstr=nstr+ String.valueOf(str.charAt(i)); //extracts each character

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

    public void reverseNums(int num){
        int sum=0;
        int lastNum=0;
        while(num!=0){

            lastNum=(num%10);
            sum=(sum*10)+lastNum;
            num=num/10;}
    System.out.println(sum);}



    public String reverseOrderOfWords(String input) {
        String[] words = input.split(" ");
        StringBuilder reverseString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reverseString.append(words[i]).append(" ");
        }
        System.out.println("reverseOrderOfWordsString = " + reverseString);
        return reverseString.toString();
    }
}
