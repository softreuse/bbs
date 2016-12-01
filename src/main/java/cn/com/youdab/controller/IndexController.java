package cn.com.youdab.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by youweirong on 16/12/1.
 */
@RestController
public class IndexController{
	@RequestMapping("/")
	public Object showIndex(){
		return "hello bbs!";
	}
}
