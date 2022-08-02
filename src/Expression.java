import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {
    private static final List<Character> openBrackets = Arrays.asList( '(', '{', '<', '[' );
    private static final List<Character> closeBrackets = Arrays.asList( ')', '}', '>', ']' );

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for(char ch: input.toCharArray()) {
            if(openBrackets.contains(ch))
                stack.push(ch);

            if(closeBrackets.contains(ch)) {
                if(stack.isEmpty())
                    return false;
                if(openBrackets.indexOf(stack.pop()) != closeBrackets.indexOf(ch))
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
