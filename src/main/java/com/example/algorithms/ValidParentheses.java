package com.example.algorithms;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "({[]})";
        boolean check = checkIfValidParentheses(str);
        System.out.println("check : "+ check);
    }

    private static boolean checkIfValidParentheses(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch: str.toCharArray()) {
            System.out.println(ch);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
                System.out.println("stack Push : " + ch);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("stack.isEmpty() : " + stack.isEmpty());
                    return false;
                }

                char top = stack.pop();
                System.out.println("top : " + top);

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }
}
