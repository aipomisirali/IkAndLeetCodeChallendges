package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {
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
}
