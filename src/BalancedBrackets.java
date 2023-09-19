import java.util.Stack;
 // the time complexity is O(n) for this function

public class BalancedBrackets {

    public static boolean hasBalancedParentheses(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String testString1 = "((()))"; // True
        String testString2 = "(()))";  // False

        System.out.println(hasBalancedParentheses(testString1)); // Output: true
        System.out.println(hasBalancedParentheses(testString2)); // Output: false
    }
}