package com.coderain.springrestapibasic.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/**
* <h1>UserController</h1>
* <p>
*     This will be where all the requests will be for user related responses,
 *    will use a service class that contains all the methods for handling requests
* </p>
* @author  Darius Rain
* @version 1.0
* @since   21-1-21
*/

// Rest controller is needed for Spring to know that this class handles API requests
// Request mapping is used to modify the path of the URI for the API for requests
@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {

    // This is the service is needed for its methods and possible values it contains.
    private UserService userService;

    /**
    * Constructor which takes in one argument that is the UserService
     * which contains all the fields and methods needed to perform the expected
     * operations on endpoint anotated above.
     * Annotation -> @Autowired is needed for the controller to auto instatiate the UserService
     *  without that annotation there will be an error
    * @param userService A class that consitsts of handler methods in relation of the modal
    * @see UserService
    * @return UserController returns the controller for the mapping(s) of the API
    */
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
    * About ...
     * Annotation -> @GetMapping is needed to let the controller know that this method
     * is for a HTTP GET request.
    * @see UserService#getUsers()
    * @return A list of User Modals from te database.
    */
    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

}
