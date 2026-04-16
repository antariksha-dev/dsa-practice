import java.util.Stack;

class ParenthesisChecker {
    public static void main(String []args) {
        boolean bool = checkParanthesis("}");
        System.out.println(bool);
    }

    public static boolean checkParanthesis(String str) {
        Stack<Character> stack = new Stack<>();
        for(Character ch: str.toCharArray()) {
            if("{[(".indexOf(ch) != -1) {
                stack.push(ch);
            } else if(")}]".indexOf(ch) != -1) {
                if (stack.isEmpty()) {
                    return false;
                }
                if(ch == '}' && stack.peek() != '{') {
                    return false;
                } 
                else if(ch == ']' && stack.peek() != '[') {
                    return false;
                }
                else if(ch == ')' && stack.peek() != '(') {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }  
}