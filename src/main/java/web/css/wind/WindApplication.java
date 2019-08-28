package web.css.wind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WindApplication {

	public static void main(String[] args) {
		SpringApplication.run(WindApplication.class, args);
	}

}
