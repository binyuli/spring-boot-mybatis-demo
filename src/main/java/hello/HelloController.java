package hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String hello() {
		return "你好，世界！";
	}
	
	@RequestMapping("/hello/{myName}")
	public String index(@PathVariable String myName){
		return "hello " + myName +" !!";
	}
		
}
