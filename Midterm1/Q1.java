public class Q1 {
    
}
/ identify the Input Size (n):
// Identify Basic Operations:

// Count the Number of Basic Operations:
// Analyze the algorithm and count how many times the basic operations are executed in terms of the input size 

// Simplify the Expression:

// Determine the Time Complexity Notation:
public static int percentageLetter(String s, char letter) {
    // step 1 input size: n 
    // step 2 basic operation: s.charAt(i) == letter
    // Step 3 number of basic operations: n
    // Step 4 and 5 time complexity: O(n) + O(1) = O(n)

    int count = 0;
    for (int i = 0; i < s.length(); i++) { // O(n)
        if (s.charAt(i) == letter) {
            count++;    // O(1)
        }
    }
    int n = s.length(); // O(1)
    return (int) (((double) count / n) * 100); // O(1)
}

    //time complexity: 
}


public static int percentageLetter(String s, char letter) {
    // Initialize a counter to keep track of occurrences of the specified letter in the input string.
    int count = 0;
    
    // Iterate through each character in the input string.
    for (int i = 0; i < s.length(); i++) {
        // Check if the current character matches the specified letter.
        if (s.charAt(i) == letter) {
            // If a match is found, increment the counter.
            count++;
        }
    }
    
    // Store the length of the input string in variable n.
    int n = s.length();
    
    // Calculate the percentage of occurrences of the letter in the input string.
    // Convert the count to a percentage by dividing it by the length of the input string and multiplying by 100.
    return (int) (((double) count / n) * 100);
}
