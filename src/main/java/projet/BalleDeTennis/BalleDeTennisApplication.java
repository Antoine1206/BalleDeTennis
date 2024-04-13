package projet.BalleDeTennis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class BalleDeTennisApplication {

	public static void main(String[] args) {
		SpringApplication.run(
				BalleDeTennisApplication.class, args);
	}

}
