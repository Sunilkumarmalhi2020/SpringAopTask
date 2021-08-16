package springbootconfig.db;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
//@RefreshScope
@ConfigurationProperties(prefix = "spring.datasource")
public class ApplicationProperties {

	private String url;
	private String password;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
