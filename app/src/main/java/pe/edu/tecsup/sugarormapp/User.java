package pe.edu.tecsup.sugarormapp;

import com.orm.dsl.Table;

/**
 * Created by Alumno on 19/04/2018.
 */
@Table
public class User {

    private Long id;
    private String fullname;
    private String email;
    private String password;

    public User(){

    }

    public User(String fullname, String email, String password ){
        this.setEmail(email);
        this.setPassword(password);
        this.setFullname(fullname);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
