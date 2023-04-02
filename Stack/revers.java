import java.util.Stack;
public class revers {
    public static void main(String[] args) {
        String ans = reverse("Hello World");
        System.out.println(ans);
    }
    public static String reverse(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        String result = "";
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }
}
