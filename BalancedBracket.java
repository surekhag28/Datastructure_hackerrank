import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BalancedBracket {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
    	
    	Stack<Character> stack = new Stack<Character>();    	
    	
    	for(int i=0;i<s.length();i++) {
    		char c = s.charAt(i);
    		if(c=='{' || c=='[' || c=='(') {
    			stack.push(c);
    			continue;
    		}
    		if(stack.isEmpty())
    			return "NO";
    		switch(c) {
    			case '}':
    				if(stack.pop()!='{')
    					return "NO";
    				break;
    			case ']':
    				if(stack.pop()!='[')
    					return "NO";
    				break;
    			case ')':
    				if(stack.pop()!='(')
    					return "NO";
    				break;
    		}
    	}
    	if(stack.isEmpty())
    		return "YES";
    	else
    		return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);
            System.out.println(result);

        }


        scanner.close();
    }
}
