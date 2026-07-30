class ValidParentheses {
    public boolean isValid(String s) {
        // A valid string must have an even length
        if (s.length() % 2 != 0) {
            return false;
        }
        
        // Primitive array to act as our stack for maximum performance
        char[] stack = new char[s.length()];
        int top = -1;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // If it's an opening bracket, push the expected closing bracket
            if (c == '(') {
                stack[++top] = ')';
            } else if (c == '{') {
                stack[++top] = '}';
            } else if (c == '[') {
                stack[++top] = ']';
            } else {
                // If it's a closing bracket:
                // 1. Check if stack is empty (top == -1)
                // 2. Check if the top of the stack matches the current character
                if (top == -1 || stack[top--] != c) {
                    return false;
                }
            }
        }
        
        // If top is -1, the stack is empty and all brackets were matched
        return top == -1;
    }
}