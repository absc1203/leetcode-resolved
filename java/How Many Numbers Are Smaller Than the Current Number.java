class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] numsSmaller = new int[nums.length];
		int cont=0;
		
		for (int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums.length; j++) {
				if(nums[i] != nums[j] && nums[i] > nums[j]) {
					cont++;
				}
				
			}
			
			numsSmaller[i] = cont;
			cont = 0;
		}
		
		return numsSmaller;
        
    }
}