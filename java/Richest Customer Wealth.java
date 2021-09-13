class Solution {
		public int maximumWealth(int[][] accounts) {

			int maior = 0;
			int atual = 0;

			for (int i = 0; i < accounts.length; i++) {
				for (int j = 0; j < accounts[i].length; j++) {
					atual += accounts[i][j];
				}
				if (atual > maior) {
					maior = atual;
					atual = 0;
				} else {
					atual = 0;
				}

			}
			return maior;
		}
	}