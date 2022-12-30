package org.cs.Leetcode;

import org.cs.DataStructures.Stack.Stack;

/*
* @author ZQR0
* @since 30.12.2022
* Valid Parentheses leetcode solution
*
* Example:
* Input: s = "()"
* Output: true
*
* Input: s = "(]"
* Output: false
*/
public class ValidParentheses {

    /*
    * @method isValid
    * @param String s - input string
    * @returns boolean
    * Explaining: we create a stack, where we just add an opposite symbol,
    * if we have first symbol of pair, after we check if stack is empty
    * If stack is not empty, we have the pair
    */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '(') {
                stack.push(')');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
