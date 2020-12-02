package base_pakage;

import java.util.LinkedList;
import java.util.List;

public class UserService {
    public User authorizate(String name, Integer password, Database database) {
        List<String> propertiesUser = new LinkedList<>();
        User user = new User();

        if(propertiesUser.size() == 0){
            user.setAuthorized(false);
        }

        return user;
    }

    public Boolean registrate(String name, Integer password, Database database) {
        return database.registrate(name, password);
    }
}
