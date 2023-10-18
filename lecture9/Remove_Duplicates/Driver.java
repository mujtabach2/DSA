package Remove_Duplicates;

import java.util.Stack;

public class Driver {
    public static String removeDuplicates(String str)
    {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for(char c: str.toCharArray())
        {
            if(!stack.isEmpty() && stack.peek() == c)
            {
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        while (!stack.isEmpty())
        {
            result.append(stack.pop());
        }

        return result.reverse().toString();
    }
    public static void main(String[] args) {

        System.out.println(removeDuplicates("abccbz"));
        
    }
}
