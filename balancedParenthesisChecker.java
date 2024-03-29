package StriverDSASheet;

import java.util.Stack;

public class balancedParenthesisChecker {
    boolean isBalanced(String S) {
        Stack<Character> st = new Stack<>();
        if (S.charAt(0) == '}' || S.charAt(0) == ']' || S.charAt(0) == ')'){
            return false;
        }
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '{' || S.charAt(i) == '[' || S.charAt(i) == '(') {
                st.push(S.charAt(i));
            } else if ((S.charAt(i) == ']' && st.peek() == '[') ||
                    (S.charAt(i) == ')' && st.peek() == '(') ||
                    (S.charAt(i) == '}' && st.peek() == '{')) {
                st.pop();
            } else{
                return false;
            }
        }
        return st.isEmpty();
    }
}
