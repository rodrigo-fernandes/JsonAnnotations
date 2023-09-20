package br.com.teste.core;

/**
 * Classe para manipulação de Strings
 * 
 * @author Rodrigo Fernandes
 */
public class StringFormat {

	public static boolean isMaskChar(char c) {
		return (c == '#' || c == '0');
	}

	public static String stringFormat(String mascara, String value) {

		if (mascara == null || value == null)
			return "";

		int maskReplace = 0;
		for (int i = 0; i < mascara.length(); i++) {
			if (mascara.charAt(i) == '#') {
				maskReplace++;
			}
		}

		if (value.length() != maskReplace) {

			// Passado um determinado valor, é substituido pela máscara.

			StringBuilder sb = new StringBuilder();

			int maskCounter = 0;
			int valueCounter = 0;
			while (maskCounter < mascara.length()) {
				while (maskCounter < mascara.length() && valueCounter < value.length()) {
					if (isMaskChar(mascara.charAt(maskCounter))) {
						sb.append(value.charAt(valueCounter));
						valueCounter++;
						maskCounter++;
					} else if (value.charAt(valueCounter) == mascara.charAt(maskCounter)) {
						sb.append(mascara.charAt(maskCounter));
						maskCounter++;
						valueCounter++;
					} else {
						sb.append(mascara.charAt(maskCounter));
						maskCounter++;
					}
				}
				if (maskCounter < mascara.length() && maskReplace != value.length()
						&& isMaskChar(mascara.charAt(maskCounter))) {
					sb.append("");
					maskCounter++;
				} else {
					return sb.toString().trim();
				}
			}
			return sb.toString().trim();
		}

		StringBuilder sb = new StringBuilder();
		int replace = 0;
		for (int i = 0; i < mascara.length(); i++) {
			if (mascara.charAt(i) == '#') {
				sb.append(value.charAt(replace));
				replace++;
			} else {
				sb.append(mascara.charAt(i));
			}
		}

		return sb.toString();
	}

}
