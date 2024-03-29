package com.example.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

//テスト
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("cookie")
public class CookieController {
	@GetMapping("/set")
    @ResponseBody
    public String setCookie(@RequestParam String value, HttpServletResponse res) {
        // cookie名をtest_cookieとして保存します
        res.addCookie(new Cookie("test_cookie", value));
        return "保存しました";
    }
}
