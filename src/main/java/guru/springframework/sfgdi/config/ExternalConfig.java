package guru.springframework.sfgdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties("demo")
@Configuration
public class ExternalConfig {
    String username;
    String password;
    String url;
  //  String jdbcurl; --> doesn't work as property name(jdbcurl) is different in yml file (url)

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String jdbcurl) {
        this.url = jdbcurl;
    }
}
