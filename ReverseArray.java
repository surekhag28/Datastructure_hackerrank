import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ReverseArray {

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
    	
    	int i=0,j=a.length-1;
    	
    	while(i<=j) {
    		int temp=a[i];
    		a[i]=a[j];
    		a[j]=temp;
    		i++;j--;
    	}
    	
    	return a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int arrCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[arrCount];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] res = reverseArray(arr);

        for(int i=0;i<res.length;i++) {
        	System.out.print(res[i]+" ");
        }
        scanner.close();
    }
}

