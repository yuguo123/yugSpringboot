package yug.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Test1 {

	
	@RequestMapping(value="/test/test1")
	public String printStr() {
		return "���뵽��springboot��Ŀ��";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Test1.class, args);
	}
}
