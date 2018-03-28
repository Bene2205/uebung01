package ueb01;

class Palindrom {
	static boolean istPalindrom(String s) {
		s = s.toLowerCase();
		s = s.replace(" ", "");
		char[] sa = s.toCharArray();

		CharStack cs = new CharStackImpl();

		for (int i = 0; i < sa.length/2; i++) {
			cs.push(sa[i]);
		}

		int i = 0;
		if (sa.length%2!=0 && sa.length!= 1){
			i++;
		}
		while(i < sa.length/2) {
			char remVal = cs.pop();
			if(remVal != sa[(sa.length/2)+i]){
				return false;
			}
			i++;
		}

		return true;
	}
}
