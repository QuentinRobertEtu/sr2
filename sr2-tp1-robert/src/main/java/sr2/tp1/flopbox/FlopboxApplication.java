package sr2.tp1.flopbox;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlopboxApplication {

	private static final Logger log = LoggerFactory.getLogger(FlopboxApplication.class);

	public static void main(String[] args) {
		log.info("a");
		SpringApplication.run(FlopboxApplication.class, args);
	}

}
