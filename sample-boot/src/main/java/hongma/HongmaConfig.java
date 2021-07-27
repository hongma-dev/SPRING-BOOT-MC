package hongma;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HongmaConfig {

	@Bean
	public Hongma hongma() {
		Hongma hongma = new Hongma();
		hongma.setName("hongma");
		hongma.setAge(31);
		
		return hongma;
	}
}
