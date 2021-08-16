package springbootconfig.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springbootconfig.db.ApplicationProperties;
import springbootconfig.db.DbConfiguration;

@RestController

public class ControlrTst {

	/*@Autowired
	private ApplicationProperties applicationProperties;*/
	
	@Autowired
	private DbConfiguration dbConfig;
	
	/*@GetMapping("/api")
	public String getData() {
		
		return applicationProperties.getUrl();
	}*/
	
	@GetMapping("/api1")
	public String getData1() {
		
		return dbConfig.getUrl()+"\n	"+dbConfig.getEmail();
	}
}
