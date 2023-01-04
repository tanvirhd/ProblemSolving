package ProblemNumber20;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        String data = "((";
        System.out.println(solution(data));
    }

    public static boolean solution(String s){

        if(s.length() < 2) return false;
        Stack<Character> stack = new Stack<>();
        HashMap<Character,Character> mappedPair = new HashMap<>(){{
            put(')','(');
            put('}','{');
            put(']','[');
        }} ;

        for(Character c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                //System.out.println("pushed character = "+c);
                stack.push(c);
            }else{
                if(stack.isEmpty()) return false;

                //System.out.println("looking for = "+mappedPair.get(c));
                //System.out.println("compare with = "+stack.peek());
                if(mappedPair.get(c) == stack.peek()) stack.pop();
                else return  false;
            }
        }

        return  stack.isEmpty();
    }
}
