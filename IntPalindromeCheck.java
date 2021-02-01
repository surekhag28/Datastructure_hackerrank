public class IntPalindromeCheck {
    public static boolean isPalindrome(int x) {
    	
    	int newNum=0;
    	int origNum=x;
    	
    	if(x<0 || (x%10==0 && x!=0))
    		return false;
    	
    	while(x!=0) {
    		int r = x%10;
    		newNum = newNum*10+r;
    		x=x/10;
    	}
    	
    	System.out.println(newNum);
        if(origNum==newNum)
        	return true;
        else
        	return false;
    }
    
    public static void main(String[] args) {
		int x = -121;
		System.out.println(isPalindrome(x));
	}
}