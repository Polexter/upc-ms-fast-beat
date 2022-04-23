package upc.ms.fast.beat;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import upc.ms.fast.beat.config.FastBeatProperties;

@SpringBootApplication
@EnableAdminServer
@EnableConfigurationProperties(FastBeatProperties.class)
public class UpcMsFastBeatApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpcMsFastBeatApplication.class, args);
	}

}
