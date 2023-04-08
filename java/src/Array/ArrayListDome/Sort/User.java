package Array.ArrayListDome.Sort;

public class User {
    private String id;
    private  String usename;
    private  String password;

    public User() {

    }

    public User(String id, String usename, String password) {
        this.id = id;
        this.usename = usename;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
