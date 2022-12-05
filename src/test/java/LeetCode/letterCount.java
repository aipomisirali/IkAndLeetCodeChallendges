package LeetCode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import  java.util.LinkedHashMap;

public class letterCount {

    @Test
    public void tsetCode(){

        countNumRepLetterInWord("ghkjfgdtrdrdd  ddhgjwwwssddvvbb");
    }

    public void countNumRepLetterInWord(String str){
            // if order is matter, we can use LinkedHashMap instead

        Map<Character, Integer> output = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            char[] ch1=str.toCharArray();
            char chValue=ch1[i];

            if (output.containsKey(chValue)) {
                output.put(chValue, output.get(chValue)+1);

            } else {
                output.put(chValue, 1);
            }

        }

        System.out.println(output);}}