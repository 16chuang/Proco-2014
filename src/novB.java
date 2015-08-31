import java.util.ArrayList;
import java.util.Scanner;

/**
 * STANFORD PROCO 2014 | NOV B
 * Find the nth prime number, where 1 ≤ n ≤ 1000.
 * 
 * @author clairehuang
 *
 */

public class novB {
	
	/**
	 * Stores a list of the primes found so far.
	 * Used both to keep track of the number of primes found
	 * and to test factorization of new prime candidates.
	 */
	static private ArrayList<Integer> primes;

	/**
	 * Prints the nth prime number given an integer n.
	 * @param args
	 */
	public static void main(String[] args) {
		// set up
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		primes = new ArrayList<Integer>();
		
		// add 2 as the first prime (we'll only be checking odd #s from now on)
		primes.add(2);
		
		// if user wants prime #2 or greater, start testing numbers
		if (n > 1) {
			int testNum = 3;
			while (primes.size() < n) { // while we haven't found the nth prime yet
				if (isPrime(testNum)) primes.add(testNum); // check if prime and add to list
				testNum += 2; // check the next odd number
			}
		}
		
		// print the last prime in the list
		System.out.println(primes.get(primes.size() - 1));
	}
	
	/**
	 * Returns whether a given candidate number is prime.
	 * @param num
	 * @return
	 */
	private static boolean isPrime(int num) {
		for (int prime : primes) {
			// if past square root of candidate number, no need to keep checking
			if (prime > Math.sqrt(num)) break; 
			
			// if divisible by a prime factor, not a prime
			if (num % prime == 0) return false;
		}
		
		return true;
	}
	
}
