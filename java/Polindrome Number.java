class Solution {
   public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		int reverse = reverse(x);
		return x == reverse;

	}

	public int reverse(int x) {
		int reverse = 0;
		while (x != 0) {
			int pop = x % 10;
			x /= 10;
			reverse = reverse * 10 + pop;
		}
		return reverse;
	}
}