package ueb01;

class Palindrom {
	static boolean istPalindrom(String s) {
		// Verwenden Sie die Klasse CharStackImpl um auf Palindrom zu testen!
		s = s.trim();
		s = s.toLowerCase();
		char[] pali = s.toCharArray();
		CharStack cs = new CharStackImpl();

		//länge 1 immer true
		if (pali.length == 1) return true;

		// wenn ungerade länge ignoriere element in der mitte
		if (pali.length % 2 != 0) {
			for (int i = (pali.length % 2); i < pali.length - 1; i++) {
				cs.push(pali[i]);
			}
		} else {
			// füge 2 hälfte des arrays in charstack
			for (int i = (pali.length % 2) - 1; i < pali.length - 1; i++) {
				cs.push(pali[i]);
			}
		}
		//prüfe ob erste hälfte mit charstack übereinstimmt
		for (int i = 0; i < pali.length % 2; i++){
			if (pali[i] != cs.pop()) {
				return false;
			}
		}

		// alles passt
		return true;
	}
}
