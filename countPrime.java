public class countPrime {

	public static void main(String[] args) {

		System.out.println(countPrime(1500));
	}

	public static int countPrime(int n) {
		int count = 0;
		for (int i = 1; i < n; i++) {
			if (i%2!=0 && isPrime(i)) {
				count++;
			}
		}
		return count;

	}

	public static boolean isPrime(int n) {
		boolean isPrime = true;
		if (n == 1 | n == 2 | n == 3) {
			return true;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				isPrime = false;
				return isPrime;
			}
		}
		return isPrime;
	}
}