package guru.springframework.sfgdi.datasource;

public class FakeDataSource {
    String username;
    String password;
    String jdbcurl;
// Can declare vars as private final and remove Setters to use constructor DI effectively
//    public FakeDataSource(String username, String password, String jdbcurl) {
//        this.username = username;
//        this.password = password;
//        this.jdbcurl = jdbcurl;
//    }

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

    public String getJdbcurl() {
        return jdbcurl;
    }

    public void setJdbcurl(String jdbcurl) {
        this.jdbcurl = jdbcurl;
    }
}
