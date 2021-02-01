import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class EqualStack {

    /*
     * Complete the twoStacks function below.
     */
    static int twoStacks(int x, int[] a, int[] b) {
        int sum=0;
        int count=0;
        
        Stack<Integer> stackA = new Stack<Integer>();
        Stack<Integer> stackB = new Stack<Integer>();
        
        for(int i=a.length-1;i>=0;i--)
        	stackA.push(a[i]);
        for(int i=b.length-1;i>=0;i--)
        	stackB.push(b[i]);
        
        int flagA=0,flagB=0;
        while(sum<=x) {
        	if(stackA.peek()>stackB.peek() && (stackA.peek()+sum)<=x) {
        		sum+=stackA.pop();
        		flagA=1;
        		count++;
        	}else if(stackB.peek()>stackA.peek() && (stackB.peek()+sum)<=x){
        		sum+=stackB.pop();
        		flagB=1;
        		count++;
        	}else if(stackA.peek()==stackB.peek()) {
        		if(flagA==1 && (stackB.peek()+sum)<=x) {
        			sum+=stackB.pop();
        			count++;
        		}else if(flagB==1 && (stackA.peek()+sum)<=x) {
        			sum+=stackA.pop();
        			count++;
        		}
        	}else if((stackA.peek()+sum<=x)) {
        		sum+=stackA.pop();
        		count++;
        	}
        	else if((stackB.peek()+sum<=x)) {
        		sum+=stackB.pop();
        		count++;
        	}
        	else
        		break;
        		
        }
        
    	return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int g = Integer.parseInt(scanner.nextLine().trim());

        for (int gItr = 0; gItr < g; gItr++) {
            String[] nmx = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nmx[0].trim());

            int m = Integer.parseInt(nmx[1].trim());

            int x = Integer.parseInt(nmx[2].trim());

            int[] a = new int[n];

            String[] aItems = scanner.nextLine().split(" ");

            for (int aItr = 0; aItr < n; aItr++) {
                int aItem = Integer.parseInt(aItems[aItr].trim());
                a[aItr] = aItem;
            }

            int[] b = new int[m];

            String[] bItems = scanner.nextLine().split(" ");

            for (int bItr = 0; bItr < m; bItr++) {
                int bItem = Integer.parseInt(bItems[bItr].trim());
                b[bItr] = bItem;
            }

            int result = twoStacks(x, a, b);
            System.out.println(result);

        }
    }
}
