class Solution {
		public String defangIPaddr(String address) {

			String ip = "";

			for (int i = 0; i < address.length(); i++) {

				if (address.charAt(i) == '.') {
					ip = ip + Character.toString('[');
					ip = ip + Character.toString(address.charAt(i));
					ip = ip + Character.toString(']');
				} else {
					ip = ip + Character.toString(address.charAt(i));
				}

			}

			return ip;
		}
	}