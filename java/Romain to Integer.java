class Solution {
    public int romanToInt(String s) {
        final char[] romainNums = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
		final int[] decimalNums = {1, 5, 10, 50, 100, 500, 1000};
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i < romainNums.length; i++) {
			map.put(romainNums[i], decimalNums[i]);
		}
		int prev = map.get(s.charAt(0));
		int res = prev;
		
		for(int i = 1; i < s.length(); i++) {
			int cur = map.get(s.charAt(i));
			res += cur;
			
			if(cur > prev) {
				res -= 2 * prev;
			}
			
			prev = cur;
		}
		
		return res;
    }
}