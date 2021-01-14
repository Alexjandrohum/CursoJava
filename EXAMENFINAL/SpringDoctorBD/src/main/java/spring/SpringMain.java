package spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringMain {

	public static void main(String args[]) {
		ApplicationContext applicationCopntext = SpringApplication.run(SpringMain.class, args);
	}

}