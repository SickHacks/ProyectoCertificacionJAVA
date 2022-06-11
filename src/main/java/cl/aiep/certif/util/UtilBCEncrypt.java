package cl.aiep.certif.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UtilBCEncrypt {

	public static String encripta(String palabra) {
		
		return new BCryptPasswordEncoder().encode(palabra);
	}
	
	public static boolean compara(String hash, String palabra) {
		
		return new BCryptPasswordEncoder().matches(palabra, hash);
	}
	
}
