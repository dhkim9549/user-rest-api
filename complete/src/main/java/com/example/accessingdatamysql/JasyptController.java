package com.example.accessingdatamysql;

import java.util.Optional;
import java.util.HashMap;
import com.google.gson.Gson;
import org.jasypt.util.text.StrongTextEncryptor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.transaction.annotation.Transactional;

@Controller     // This means that this class is a Controller
@RequestMapping(path="/jas") // This means URL's start with /user (after Application path)
public class JasyptController {

        @GetMapping(path="/enc")
        public @ResponseBody String enc(@RequestParam String str) {
                // @ResponseBody means the returned String is the response, not a view resvDy
                // @RequestParam means it is a parameter from the GET or POST request
	
		String encStr = JasyptUtil.enc(str);

                return encStr;
        }

        @GetMapping(path="/dec")
        public @ResponseBody String dec(@RequestParam String str) {
                // @ResponseBody means the returned String is the response, not a view resvDy
                // @RequestParam means it is a parameter from the GET or POST request

                String decStr = JasyptUtil.dec(str);

                return decStr;
        }
}

