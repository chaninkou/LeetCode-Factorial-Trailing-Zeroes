package factorial;

public class Main {
	public static void main(String[] args) {
		int n = 100;
		
		System.out.println("Input: " + n);
		
		CountFactorialTrailingZeroesFunction solution = new CountFactorialTrailingZeroesFunction();
		
		System.out.println("Solution: " + solution.trailingZeroes(n));
	}
}
