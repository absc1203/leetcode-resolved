	class Solution {
		public int[] shuffle(int[] nums, int n) {

			int[] shuffle = new int[nums.length];

			for (int i = 0; i < nums.length / 2; i++) {
				shuffle[i * 2] = nums[i];
				shuffle[(i * 2) + 1] = nums[i + nums.length / 2];
			}
			return shuffle;

		}
	}