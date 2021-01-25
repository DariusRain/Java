package com.coderain.springrestapibasic.user;
/**
* <h1>User</h1>
* <p>
*    A modal for further injection into postgresql database using
*   Spring Jave data JPA, this class can be instantiated and used to
*   hold all the values set for a user in a web application minus the password
*   saving security for another project with similar design.
* </p>
* @author  Darius Rain
* @version 1.0
* @since   21-1-21
*/
public class User {

    // Fields
    private Long id;
    private String name;
    private String email;
    private int age;

    // Constructor
    public User(String name, String email, int age, Long id) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.id = id;
    }

    // Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

}
