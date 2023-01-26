package chiba.dev.departementservice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DepartementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartementServiceApplication.class, args);
	}

}
