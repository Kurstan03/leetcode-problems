package org.example.easy;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        if (s.length() % 2 == 1) return false;
        char[] stack = new char[0];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                char[] newStack = new char[stack.length + 1];
                for (int j = 0; j < stack.length; j++) {
                    newStack[j] = stack[j];
                }
                newStack[stack.length] = s.charAt(i);
                stack = newStack;
            } else {
                if (stack.length == 0) return false;
                if ((s.charAt(i) == ')' && stack[stack.length - 1] == '(')
                        || (s.charAt(i) == ']' && stack[stack.length - 1] == '[')
                        || (s.charAt(i) == '}' && stack[stack.length - 1] == '{')) {
                    char[] newStack = new char[stack.length - 1];
                    for (int j = 0; j < newStack.length; j++) {
                        newStack[j] = stack[j];
                    }
                    stack = newStack;
                } else return false;
            }
        }
        return stack.length == 0;
    }

    public static boolean isValidExpression2(String s) {
        Stack<Character> stack = new Stack<>();
        char[] brackets = {'(', ')', '[', ']', '{', '}'};

        for (char ch : s.toCharArray()) {
            if (ch == brackets[0] || ch == brackets[2] || ch == brackets[4]) {
                stack.push(ch);
            } else if (ch == brackets[1] || ch == brackets[3] || ch == brackets[5]) {
                if (stack.isEmpty() || !isValidPair(stack.pop(), ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isValidPair(char openBracket, char closeBracket) {
        return (openBracket == '(' && closeBracket == ')') ||
                (openBracket == '[' && closeBracket == ']') ||
                (openBracket == '{' && closeBracket == '}');
    }
}
