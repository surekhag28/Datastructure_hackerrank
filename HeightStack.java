import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'equalStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h1
     *  2. INTEGER_ARRAY h2
     *  3. INTEGER_ARRAY h3
     */

	public static int getTotalHeight(List<Integer> list) {
		int sum=0;
		for(int i=0;i<list.size();i++) {
			sum+=list.get(i);
		}
		return sum;
	}
	
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
    	
    	
    	int s1=getTotalHeight(h1);
		int s2=getTotalHeight(h2);
		int s3=getTotalHeight(h3);
		
		int n=1;
    	while(n!=0) {
    		if(s1==s2 && s1==s3) {
    			n=0;
        		return s1;
    		}else if(s1>s2 && s1>s3) {
    			s1-=h1.remove(0);
    			continue;
    		}else if(s2>s1 && s2>s3) {
    			s2-=h2.remove(0);
    			continue;
    		}else if(s3>s1 && s3>s2) {
    			s3-=h3.remove(0);
    			continue;
    		}else
    			return 0;
    	}
    	
    	return 0;
    }
}

public class HeightStack {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n1 = Integer.parseInt(firstMultipleInput[0]);

        int n2 = Integer.parseInt(firstMultipleInput[1]);

        int n3 = Integer.parseInt(firstMultipleInput[2]);

        List<Integer> h1 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> h2 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> h3 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.equalStacks(h1, h2, h3);
        System.out.println(result);


        bufferedReader.close();
    }
}
