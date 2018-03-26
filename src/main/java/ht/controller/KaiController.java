package ht.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ht.service.KaiService;

@Controller
@RequestMapping("/kai")
public class KaiController {
	@Resource
	KaiService kaiService;
	
	@RequestMapping("/say")
	public String say(){
		System.out.println("hahaha");
		System.out.println("凯哥。。。");
		return "kai";
	}
	
	@RequestMapping("/hi")
	@ResponseBody
	public String hi(){
		return "你好123";
	}
	
	@ResponseBody
	@RequestMapping("/testJson")
	public Map<String, Object> testJson(String id) {
	    Map<String, Object> map = new HashMap<>();
	    Map<String, Object> data = new HashMap<>();
	    data.put("id", id);
	    map.put("result", 0);
	    map.put("message", "成功 success");
	    map.put("data", data);
	    kaiService.cc();
	    System.out.println(333);
	    return map;
	}

}
