package com.example.accessingdatamysql;

import java.util.HashMap;
import com.google.gson.Gson;
import org.jasypt.util.text.BasicTextEncryptor;

public class JasyptUtil {

	private static String pw = "kkkk0000000000";

        public static String enc(String str) {

		BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
		textEncryptor.setPassword(pw);
		String encStr = textEncryptor.encrypt(str);

                return encStr;
        }

        public static String dec(String str) {

                BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
                textEncryptor.setPassword(pw);
		String decStr = textEncryptor.decrypt(str);

                return decStr;
        }

	public static HashMap decTkn(String tkn) {
		
		String json = dec(tkn);
		Gson gson = new Gson();
		HashMap map = gson.fromJson(json, HashMap.class);

		return map;
	}
}
