package controller;
import model.Cipher;
import view.WinApp;
public class Main {
	public static void main(String[] args) {
		new WinApp();
		char c = 'A' ^ 'B';
		System.out.printf("%c %c\n", c, c ^ 'B');
		final String
			st = "Sempre Forza Napoli! - Napoli 1926",
			stCrypt = Cipher.cryptTraslateAZ(st, 3),
			stDecpt = Cipher.cryptTraslateAZ(stCrypt, -3), k = "Manolas",
			stCrypt1 = Cipher.vigenere(st, k, true),
			stDecpt1 = Cipher.vigenere(stCrypt1, k, false);
		System.out.printf("""
		>> %s
		** %s
		<< %s

		@@ %s
		?? %s
		""", st, stCrypt, stDecpt, stCrypt1, stDecpt1);
	}
}
