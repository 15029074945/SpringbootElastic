package com.example;

import com.example.config.ElasticsearchConfig;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@Configuration
@ComponentScan(basePackages = "com.example")
@EnableAutoConfiguration(exclude = {ElasticsearchConfig.class})
public class SpringbootdemoApplication implements CommandLineRunner {



	@Override
	public void run(String... strings) throws Exception {
//		ValueOperations<String, String> ops = this.template.opsForValue();
//		String key = "spring.boot.redis.test";
//		if (!this.template.hasKey(key)) {
//			ops.set(key, "foo");
//		}
//		System.out.println("Found key " + key + ", value=" + ops.get(key));


	}


	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}






}
