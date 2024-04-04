import java.util.HashMap;
import java.util.*;

public class JavaTest_Q4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        
        // Convert the string to lowercase to make it case-insensitive
        str = str.toLowerCase();
        
        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // If the character is not a space
            if (ch != ' ') {
                // Increment the count of the character in the map
                charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
            }
        }
        
        // Print the duplicate characters
        System.out.println("Duplicate characters in the string:");
        for (char ch : charCountMap.keySet()) {
            if (charCountMap.get(ch) > 1) {
                System.out.println(ch);
            }
        }
    }
}
