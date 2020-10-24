package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


// @RestController為@ResponseBody + @Controller 可回傳JSON物件 但不能回傳HTML頁面 
@Controller
public class IndexController {
	// 從/訪問之GET請求將映射到該method
	@GetMapping("/")
	public String index() {
		// thymeleaf將尋找與return相同之檔名為回傳的HTML頁面
		return "index";
	}
}
