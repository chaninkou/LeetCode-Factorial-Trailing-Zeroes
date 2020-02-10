package factorial;

public class CountFactorialTrailingZeroesFunction {
    // Recursion method
    public int trailingZeroes(int n) {
        if(n == 0){
            return 0;
        }
        
        // count = n/5 + n/25 + n/125 + ... + 0
        return n / 5 + trailingZeroes(n / 5);
    }
    
    // Iterative solution, counting how many 5's in the factorial
    public int trailingZeroes2(int n){
    	int count = 0;
    	
    	while(n != 0){
    		int currentFive = n / 5;
    		
    		count += currentFive;
    		
    		n = currentFive;
    	}
    	
    	return count;
    }
}
