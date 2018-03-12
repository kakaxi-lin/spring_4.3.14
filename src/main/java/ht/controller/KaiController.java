package ht.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/kai")
public class KaiController {
	@RequestMapping("/say")
	public String say(){
		System.out.println("hahaha");
		System.out.println("凯哥。。。");
		return "kai";
	}

}
