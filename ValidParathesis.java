// LEETCODE
// 20. Valid Parentheses
class ValidParathesis {
    private  List<Character> leftBraces = Arrays.asList('(','[','<','{');
   private  List<Character> rightBraces = Arrays.asList(')', ']', '>','}');
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(isLeftBrace(chars[i]))
                stack.push(chars[i]);
            else if(isRightBrace(chars[i])){
                if(stack.isEmpty()) return false;
                char topOfStack = stack.pop();
                if(!bracesMatch(topOfStack,chars[i]))
                    return false;
            }

        }
        return stack.empty();
       
    }
    private  boolean isLeftBrace(char ch){
        return leftBraces.contains(ch);
    }
    private  boolean isRightBrace(char ch){
        return rightBraces.contains(ch);
    }
    private  boolean bracesMatch(char a, char right){
        return (leftBraces.indexOf(a) == rightBraces.indexOf(right));
    }
}
