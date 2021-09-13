class Solution {
		public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
			List<Boolean> kidsWithCandies = new ArrayList<Boolean>();

			int maior = 0;

			for (int i = 0; i < candies.length; i++) {
				if (candies[i] > maior) {
					maior = candies[i];
				}
			}

			for (int i = 0; i < candies.length; i++) {
				if (candies[i] + extraCandies >= maior) {
					kidsWithCandies.add(true);
				} else {
					kidsWithCandies.add(false);
				}
			}

			return kidsWithCandies;
		}
	}