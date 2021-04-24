package src.store.bean;

public class User {
    private int user_id;
    private String username;
    private String password;
    private String userphonenumber;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getUser_id() {
        return user_id;
    }


    public void setUser_id(int user_id) {
        this.user_id = user_id;
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

    public String getUserphonenumber() {
        return userphonenumber;
    }

    public void setUserphonenumber(String userphonenumber) {
        this.userphonenumber = userphonenumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userphonenumber='" + userphonenumber + '\'' +
                '}';
    }
}
