package cap.model;

/**
 * @author 刘贤熔
 * @version 1.0.0
 * @createTIme 2018/9/17 15:03
 **/
public class Admin {
    private int id;
    private String username;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
}
