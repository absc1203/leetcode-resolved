class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] positions = new int[2];
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = i; j < nums.length; j++) {
				if(nums[i] + nums[j] == target && i != j) {
					positions[0] = i;
					positions[1] = j;
					
				}
			}
			
		}
		
		return positions;
        
    }
}