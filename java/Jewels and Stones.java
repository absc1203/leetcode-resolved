class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int cont=0;
		for(int i=0;i<jewels.length();i++) {
			char compered = jewels.charAt(i);
			for(int j=0;j<stones.length();j++) {
				char compere = stones.charAt(j);
				
				if(compered == compere) {
					cont++;
				}
			}
		}
		return cont;
    }
}