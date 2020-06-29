package io.javabrains.SpringBootconfig;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyGreetingController {
	//if valuue is not available in property file 
	@Value("${my.greeting : default value }")
	private String getMassage;
	
	@Value("${my.list.value}")
	private List<String> listVal;
	

	@Value("#{${dbConnection}}")
	private Map<String, String> connString;
	
	@Autowired
	DbConnectionSetting dbConn;
	
	@GetMapping("/greeting")
	//public String getGreeting()
	public String getGreeting()
	{
		
		//return "Hello";
		return getMassage + listVal+connString+dbConn.getConnection()+dbConn.getPass()+dbConn.getPort();
		//return listVal;
		
	}

}
