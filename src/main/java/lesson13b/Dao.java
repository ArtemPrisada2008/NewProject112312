package lesson13b;

import java.nio.file.attribute.UserPrincipal;

public interface Dao {
    void addUser(User user);
    User getOneUser();
}
