package com.demo.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.beans.factory.annotation.Value;

@RestController
@RefreshScope
public class MyController {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);

    @Autowired
	private RestTemplate restTemplate;

	@Value("${name}")
    String firstName;
    
    @Value("${surname}")
    String surname;

	@GetMapping("/customer")
	public String getCustomerByCustomerNo() {
		logger.info("Inside demo-service");
		return "Welcome Customer : firstName:: " + firstName + "--surname::" + surname;
	}

	
	
}

