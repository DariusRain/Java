package com.coderain.springrestapibasic.user;

import org.springframework.stereotype.Service;

import java.util.List;

/**
* <h1>UserService</h1>
* <p>
*       This class holds all the methods and or fields handling requests,
 *    that further which can turn into CRUD operations with the expected
 *    and compatible DB for users.
* </p>
* @author  Darius Rain
* @version 1.0
* @since   21-1-24
*/
@Service
public class UserService {

    /**
    * This service method gets all users from a database
    * @see User
    * @return List<User>
    */
    public List<User> getUsers() {
        return List.of(
                new User("John Smith", "johnsmith@gmail.com", 21, 1L)
        );
    }

}
