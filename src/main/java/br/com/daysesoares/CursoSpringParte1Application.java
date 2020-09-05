package br.com.daysesoares;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursoSpringParte1Application implements CommandLineRunner {

		
	public static void main(String[] args) {
		SpringApplication.run(CursoSpringParte1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//s3Service.uploadFile("C:\\temp\\foto\\PEC108.JPG");
	}

}
