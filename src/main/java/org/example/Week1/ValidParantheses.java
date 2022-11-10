package org.example.Week1;

import java.util.Stack;

public class ValidParantheses {


    public static void main(String[] args) {

        String input1="()";
        String input2="()[]{}";
        String input3="(]";
        String input4="([)]";
        String input5="{[]}";

        System.out.println(checkValidParanthesis(input1));
        System.out.println(checkValidParanthesis(input2));

        System.out.println(checkValidParanthesis(input3));
        System.out.println(checkValidParanthesis(input4));
        System.out.println(checkValidParanthesis(input5));
    }

    public static boolean checkValidParanthesis(String str){

        Stack<Character>leftSymbolStack=new Stack<>();

        for(char c: str.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                leftSymbolStack.push(c);
            }
            else if(c==')' && !leftSymbolStack.isEmpty() && leftSymbolStack.peek()=='('){
                leftSymbolStack.pop();
            }
            else if(c=='}' && !leftSymbolStack.isEmpty() && leftSymbolStack.peek()=='{'){
                leftSymbolStack.pop();
            }
            else if(c==']' && !leftSymbolStack.isEmpty() && leftSymbolStack.peek()=='['){
                leftSymbolStack.pop();
            }
            else return false;
        }

       return leftSymbolStack.isEmpty();
    }
}
