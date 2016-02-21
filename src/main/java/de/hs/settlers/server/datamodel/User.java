package de.hs.settlers.server.datamodel;

/**
 * Created by Mastermarci on 21.02.2016.
 */
public class User {
    private String userName;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
