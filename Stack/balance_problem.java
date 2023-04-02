import java.util.Stack;

/**
 * balance_problem
 */
public class balance_problem {

    public static void main(String[] args) {
        String s = "()[{()]}";
        System.out.println(isBalanced(s));
    }

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(!isMatched(top, c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static boolean isMatched(char c1, char c2) {
        if (c1 == '(' && c2 == ')') {
            return true;
        }
        if (c1 == '[' && c2 == ']') {
            return true;
        }
        if (c1 == '{' && c2 == '}') {
            return true;
        }
        return false;
    }
}
