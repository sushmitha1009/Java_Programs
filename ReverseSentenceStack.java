import java.util.*;

public class ReverseSentenceStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of sentences
        sc.nextLine(); // Consume the newline character

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine(); // Read each sentence

            // Initialize stack for each sentence
            Stack<String> stack = new Stack<>();
            String[] words = s.split("\\s+"); // Split sentence into words
            
            // Push each word onto the stack
            for (String word : words) {
                stack.push(word);
            }

            // Pop words from stack to reverse sentence
            StringBuilder reversedSentence = new StringBuilder();
            while (!stack.isEmpty()) {
                reversedSentence.append(stack.pop());
                if (!stack.isEmpty()) {
                    reversedSentence.append(" ");
                }
            }

            // Print the reversed sentence
            System.out.println(reversedSentence.toString());
        }
        
        sc.close();
    }
}
