package entidades;

import java.util.Date;

/**
 * Created by cgallo on 05/06/20.
 */


public class User {
    private int id;
    private String username;
    private String first_name;
    private String last_name;
    private String email;
    private String password;
    private boolean is_staff;
    private boolean is_active;
    private boolean is_superuser;
    private Date last_login;
    private Date date_joined;

    // constructor para usuario guardado
    public User(int id, String username, String password, String first_name, String last_name, String email,
                boolean is_staff, boolean is_active, boolean is_superuser, Date last_login, Date date_joined) {
        this.id = id;
        this.username = username;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.is_staff = is_staff;
        this.is_active = is_active;
        this.is_superuser = is_superuser;
        this.last_login = last_login;
        this.date_joined = date_joined;
    }


}

