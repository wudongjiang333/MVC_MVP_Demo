package cn.snaptech.mvp_after.model;

public class User {
    private String name;
    private String psw;

    public User(String name, String psw) {
        this.name = name;
        this.psw = psw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return psw;
    }

    public void setPassword(String psw) {
        this.psw = psw;
    }
}
