package hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return "你好，世界！";
	}
	
	@RequestMapping("/hello/{myName}")
	public String index(@PathVariable String myName){
		return "hello " + myName +" !!";
	}
	
	@RequestMapping("/html")
	public String index() {
		return "<html><head><title>你好，世界！</title></head><body><h1>世界，你好~</h1><p>这是我的第一个站点</p></body></html>";
	}
	
}
