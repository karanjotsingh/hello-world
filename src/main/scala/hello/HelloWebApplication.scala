package hello

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * This object bootstraps Spring Boot web application.
 * Via Gradle: gradle bootRun
 *
 * @author saung/ksingh
 * @since 1.1
 */
object HelloWebApplication {

	def main(args: Array[String]) {
	   SpringApplication.run(classOf[HelloConfig]);
	}
}

@RestController
class HelloWorld
{
	@RequestMapping(Array{"/"})
	def sayHello(): String = 
	{
		"Hello World!!"
	}
}
