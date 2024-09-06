import java.util.*;

public class Balancedbrackets {
    
    // Function to check if the given string has balanced brackets
    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Push opening brackets onto the stack
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            }
            // Handle closing brackets
            else if (ch == '}' || ch == ']' || ch == ')') {
                if (stack.isEmpty()) {
                    return "NO"; // Unmatched closing bracket
                }
                
                char top = stack.pop(); // Pop the top element
                
                // Check if the popped element matches the current closing bracket
                if ((top == '{' && ch != '}') || 
                    (top == '[' && ch != ']') || 
                    (top == '(' && ch != ')')) {
                    return "NO"; // Mismatched brackets
                }
            }
        }

        // Return "YES" if the stack is empty (all brackets matched)
        return stack.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // Number of strings
        sc.nextLine(); // Consume the newline character

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine(); // Read each string
            System.out.println(isBalanced(s)); // Output "YES" or "NO"
        }
        
        sc.close();
    }
}
