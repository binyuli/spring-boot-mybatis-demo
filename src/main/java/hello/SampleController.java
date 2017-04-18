package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

	@RequestMapping("/home")
	String home() {
//		return "hello binye."; // 不加@ResponseBody无法直接返回字符串
		return "index";
	}

	@RequestMapping("/index")
	@ResponseBody
	String index() {
		return "<html><head><title>Hello World!</title></head><body><h1>Hello World!</h1><p>This is my first web site</p></body></html>";
	}

	@RequestMapping("/simple")
	@ResponseBody
	public String simple() {
		return "你好，世界 new！";
	}
	
}
