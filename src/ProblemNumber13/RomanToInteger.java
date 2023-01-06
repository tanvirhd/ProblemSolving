package ProblemNumber13;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        Map<Character,Integer> romanValueMap = new HashMap<>(){{
            put('I',1);
            put('V',5);
            put('X',10);
            put('L',50);
            put('C',100);
            put('D',500);
            put('M',1000);
        }};
        int number  = 0;
        int looper = 0;
        while (looper<s.length()){
            if( (looper+1) > s.length()) break;
            if(looper+1 == s.length())  {
                number += romanValueMap.get(s.charAt(looper));
                break;
            }
            if(romanValueMap.get(s.charAt(looper)) < romanValueMap.get(s.charAt(looper+1))){
                number += (  romanValueMap.get(s.charAt(looper+1)) - romanValueMap.get(s.charAt(looper)) );
                looper += 2;
            }else {
                number += romanValueMap.get(s.charAt(looper));
                looper += 1;
            }
        }
        return number;
    }
}
