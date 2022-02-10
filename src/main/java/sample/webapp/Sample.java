package sample.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		return String.format("Hello world!");
	}
 
 @GetMapping("/")
 public String home() {
		return String.format("Welcome!");
    }
 
 @GetMapping("/getmapping")
 public String hi(@RequestParam(value = "name", defaultValue = "Sai") String name) {
		return String.format("Hi %s", name);
	}
 
 @RequestMapping(value = "/calculate", method = RequestMethod.GET)
 public String calculate(@RequestParam int a, @RequestParam int b){
		return String.format("SUM = %d, DIFFERENCE = %d, PRODUCT = %d, QUOTIENT = %d", a + b, a - b, a * b, a / b);
	}
 
 @RequestMapping(value = "/requestmapping", method = RequestMethod.GET)
 public String hi_again(@RequestParam(value = "name", defaultValue = "Sai") String name) {
		return String.format("Hi %s", name);
	}
}
