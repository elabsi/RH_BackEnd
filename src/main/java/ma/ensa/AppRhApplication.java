package ma.ensa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AppRhApplication  {

	@Autowired
	public static void main(String[] args) {
		SpringApplication.run(AppRhApplication.class, args);
	}

}
