package model;
public class Cipher {
	public static String vigenere(String msg, String key, boolean crpt) {
		final char[] k = key.toCharArray();
		final int N = k.length;
		int j = 0;
		StringBuilder crypt = new StringBuilder();
		for (char c : msg.toCharArray())
			crypt.append(
				c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z'
					? (char) (
						(c & 0b1100000 | 1) + ((c & 0b11111) + (crpt ? 1 : -1) * (
							k[j++ % N] & 0b11111) + 'Z' - 'A') % ('Z' - '@')
						)
					: c
			);
		return crypt.toString();
	}
	public static String cryptTraslateAZ(String msg, int k) {
		StringBuilder crypt = new StringBuilder();
		for (char c : msg.toCharArray())
			crypt.append(
				c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z'
					? (char) ( (c & 0b1100000 | 1) + ((c + k & 0b11111) + 'Z' - 'A') % ('Z' - '@') )
					: c
			);
		return crypt.toString();
	}
}