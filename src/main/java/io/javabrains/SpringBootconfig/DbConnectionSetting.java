package io.javabrains.SpringBootconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
@Configuration
@ConfigurationProperties("db")
public class DbConnectionSetting {
	
	
	private String Connection;
	private int port;
	public String getConnection() {
		return Connection;
	}
	public void setConnection(String connection) {
		Connection = connection;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	private String userName;
	private String pass;

}
