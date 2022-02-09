package sample.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
 @SpringBootApplication
 @EnableAutoConfiguration
 @RestController
 public class Sample {

 public static void main(String[] args) {
		 SpringApplication.run(Sample.class, args);
}

 @GetMapping("/hello")
 public String hello() {
		return String.format("Hello new new world!!");
	}
 
 @GetMapping("/get")
 public String hi(@RequestParam(value = "name", defaultValue = "Sai") String name) {
		return String.format("Hi %s", name);
	}
 
 @RequestMapping(value = "/request", method = RequestMethod.GET)
 public String hehe(@RequestParam(value = "name", defaultValue = "Sai") String name) {
		return String.format("Hi %s", name);
	}
}