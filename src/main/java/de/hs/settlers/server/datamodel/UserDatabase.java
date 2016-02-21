package de.hs.settlers.server.datamodel;

import de.hs.settlers.server.util.HashUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mastermarci on 21.02.2016.
 */
public class UserDatabase {
    private List<User> users;

    // TODO delete or rewrite this class
    public UserDatabase() {
        users = new ArrayList<>();
        User user = new User();
        user.setUserName("testuser");
        user.setPassword(HashUtils.hashFunctionSHA("test"));
        users.add(user);
    }

    public User findUser(String username) {
        for(User  u: users) {
            if(u.getUserName().equals(username)) {
                return u;
            }
        }
        return null;
    }
}
