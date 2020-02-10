package factorial;

public class Main {
	public static void main(String[] args) {
		int n = 5;
		
		System.out.println("Input: " + n);
		
		CountFactorialTrailingZeroesFunction solution = new CountFactorialTrailingZeroesFunction();
		
		System.out.println("Solution: " + solution.trailingZeroes2(n));
	}
}
