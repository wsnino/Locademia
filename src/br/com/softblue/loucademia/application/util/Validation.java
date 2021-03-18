package br.com.softblue.loucademia.application.util;

public class Validation {

	public static void assertNotEmpty(Object obj) {
		if (obj instanceof String) {
			String s = (String) obj;
			if (StringUtils.isEmpty(s)) {
				// ERRO
			}
		}
		
		if (obj == null) {
			// ERRO
		}
	}
}
